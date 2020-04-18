package com.coviddata.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coviddata.model.StateCovidVO;
import com.coviddata.service.CovidService;

@RestController
@RequestMapping("/api/")
public class CovidController {

	@Autowired
	CovidService covidService;

	/**
	 * This method will retrieve the covid data response for the particular state
	 * 
	 * @param state
	 * @param payload
	 * @return
	 * @throws IOException
	 */
	@GetMapping("/state/{state}")
	private StateCovidVO getStateCovidData(@PathVariable("state") String state) throws IOException {
		if (!StringUtils.isEmpty(state)) {
			return covidService.getStateWiseData(state);
		} else {
			return null;
		}
	}
}
