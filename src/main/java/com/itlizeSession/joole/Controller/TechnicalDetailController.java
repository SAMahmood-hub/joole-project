package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technicalDetail")
public class TechnicalDetailController {
	@Autowired
	private TechnicalDetailService technicalDetailService;

	@PostMapping("/create")
	public TechnicalDetail saveTechnicalDetail(@RequestBody TechnicalDetail technicalDetail){
		return technicalDetailService.saveTechnicalDetail(technicalDetail);
	}
	@GetMapping()
	public List<TechnicalDetail> fetchTechnicalDetailList(){
		return technicalDetailService.fetchTechnicalDetailList();
	}
	@GetMapping("/find{id}")
	public TechnicalDetail fetchTechnicalDetailById(@PathVariable("id") Integer id){
		return technicalDetailService.fetchTechnicalDetailById(id);
	}
	@DeleteMapping("/delete{id}")
	public String deleteTechnicalDetailById(@PathVariable("id") Integer id){
		technicalDetailService.deleteTechnicalDetailById(id);
		return "TechnicalDetails is deleted successfully";
	}
	@PutMapping("/technicalDetail")
	public TechnicalDetail updateTechnicalDetailById(@RequestBody TechnicalDetail technicalDetail){
		return technicalDetailService.updateTechnicalDetailById(technicalDetail);
	}
}
