package com.proyectoconsultorio.myh.back.model.mapper;

import com.proyectoconsultorio.myh.back.model.custom.Fechas;
import java.util.Calendar;
import java.util.Date;


public class FechasMapper {
	
	public Date fechaMapper(Fechas fecha) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, fecha.getYear());
		calendar.set(Calendar.MONTH, fecha.getMonth());
		calendar.set(Calendar.DAY_OF_MONTH, fecha.getDay());
		calendar.set(Calendar.HOUR_OF_DAY, fecha.getHour());
		calendar.set(Calendar.MINUTE, fecha.getMinute());
		calendar.set(Calendar.SECOND, fecha.getSecond());
		return calendar.getTime();
	}
	
	public Fechas fechaMapper(Date date, String type) {
		Fechas fecha = new Fechas();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		switch (type) {
			case "date":
				fecha.setYear(calendar.get(Calendar.YEAR));
				fecha.setYear(calendar.get(Calendar.MONTH));
				fecha.setDay(calendar.get(Calendar.DAY_OF_MONTH));
				break;
			case "time":
				fecha.setHour(calendar.get(Calendar.HOUR_OF_DAY));
				fecha.setMinute(calendar.get(Calendar.MINUTE));
				fecha.setSecond(calendar.get(Calendar.SECOND));
				break;
			default:
				fecha.setYear(calendar.get(Calendar.YEAR));
				fecha.setYear(calendar.get(Calendar.MONTH));
				fecha.setDay(calendar.get(Calendar.DAY_OF_MONTH));
				fecha.setHour(calendar.get(Calendar.HOUR_OF_DAY));
				fecha.setMinute(calendar.get(Calendar.MINUTE));
				fecha.setSecond(calendar.get(Calendar.SECOND));
				break;
		}
		return fecha;
	}
}
