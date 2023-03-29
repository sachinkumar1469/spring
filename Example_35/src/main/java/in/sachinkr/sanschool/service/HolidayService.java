package in.sachinkr.sanschool.service;

import in.sachinkr.sanschool.model.Holiday;
import in.sachinkr.sanschool.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayService {
    private final HolidayRepository holidayRepository;
    @Autowired
    public HolidayService(HolidayRepository holidayRepository){

        this.holidayRepository = holidayRepository;
    }

    public List<Holiday> getHolidays(){

        return (List<Holiday>) this.holidayRepository.findAll();
    }
}
