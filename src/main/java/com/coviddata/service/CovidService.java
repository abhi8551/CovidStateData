package com.coviddata.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coviddata.model.StateCovidVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CovidService {

	/**
	 * This method will populate the StateCovidVO object that will populate as per
	 * State passed to the API
	 * 
	 * @param state
	 * @return
	 */
	public StateCovidVO getStateWiseData(String state) {
		StateCovidVO stateCovidData = new StateCovidVO();
		String uri = "https://api.covid19india.org/data.json";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<String> locationResponse = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		System.out.println(locationResponse.getBody());
		try {
			JsonNode response = new ObjectMapper().readTree(locationResponse.getBody());
			JsonNode statewise = response.get("statewise");
			for (JsonNode node : statewise) {
				if ((node.get("state")).asText().equalsIgnoreCase(state)) {
					return new StateCovidVO(node.get("active").asInt(), node.get("confirmed").asInt(),
							node.get("deaths").asInt(), node.get("deltaconfirmed").asInt(),
							node.get("deltadeaths").asInt(), node.get("deltarecovered").asInt(),
							node.get("recovered").asInt(), node.get("state").asText(), node.get("statecode").asText(),
							node.get("lastupdatedtime").asText());
				}
			}

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return stateCovidData;
	}
}
