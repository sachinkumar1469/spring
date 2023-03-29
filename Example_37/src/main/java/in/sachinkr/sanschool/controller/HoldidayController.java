package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Holiday;
import in.sachinkr.sanschool.repository.HolidayRepository;
import in.sachinkr.sanschool.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

@Controller
public class HoldidayController {

//    public String getHoliday(Model model, @RequestParam(required = false) boolean festival,@RequestParam(required = false) boolean federal){

    @Autowired
    private HolidayService holidayService;

    @GetMapping("/holidays/{display}")
    public String getHoliday(Model model, @PathVariable String display){
        System.out.println("In holiday controller");
        if(display.equalsIgnoreCase("federal")){
            model.addAttribute("festival",false);
            model.addAttribute("federal",true);
        } else if(display.equalsIgnoreCase("festival")) {
            model.addAttribute("festival",true);
            model.addAttribute("federal",false);
        } else{
            model.addAttribute("festival",true);
            model.addAttribute("federal",true);
        }

        List<Holiday> holidays = this.holidayService.getHolidays();
        Holiday.Type enumTypes[] = Holiday.Type.values();
        for(Holiday.Type type:enumTypes){
            model.addAttribute(type.toString(),holidays.stream().filter(h -> h.getType()==type).toArray());
        }
        return "holidays.html";
    }
}
