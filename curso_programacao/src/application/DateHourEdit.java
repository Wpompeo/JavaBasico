package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateHourEdit {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2025-08-12");
		LocalDateTime d02 = LocalDateTime.parse("2025-08-12T15:34:26");
		Instant d03 = Instant.parse("2025-08-12T15:34:26Z");

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		LocalDate nextYearLocalDate = d01.plusYears(7);

		System.out.println("----------Imprimi datas modificadas LocalDate----------");
		System.out.println();
		System.out.println("pastWeekLocalDate " + d01 + " = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate " + d01 + " = " + nextWeekLocalDate);
		System.out.println("nextYearsLocalDate " + d01 + " = " + nextYearLocalDate);

		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println();

		System.out.println("----------Imprimi datas modificadas LocalDateTime----------");
		System.out.println();
		System.out.println("pastWeekLocalDate minusDay seven " + d02 + " = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime plusDay seven " + d02 + " = " + nextWeekLocalDateTime);

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println();

		System.out.println("----------Imprimi datas modificadas Instant----------");
		System.out.println();
		System.out.println("pastWeekInstant minusDay seven " + d03 + " = " + pastWeekInstant);
		System.out.println("nextWeekInstant plusDay seven " + d03 + " = " + nextWeekInstant);
		System.out.println();

		// trabalhando com duracao datas
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d03, pastWeekInstant);

		System.out.println("----------Imprimindo calculo dias entre datas----------");
		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias invertidos = " + t4.toDays());

	}

}
