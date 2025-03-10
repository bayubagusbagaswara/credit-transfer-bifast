package com.bayu.credit_transfer_bifast;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

@SpringBootTest
class CreditTransferBifastApplicationTests {

	@Test
	void contextLoads() {

		for (int i = 1; i < 25; i++) {
			String s = generateReferenceId();
			System.out.println("Transaction-" + i + " : " + s);
		}

	}

	public static String generateReferenceId() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String timestamp = now.format(formatter);
		String randomNum = String.format("%06d", new Random().nextInt(1000000));

		String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 16); // Ambil 10 karakter UUID

		return timestamp + "_"+  randomNum + "_" + uuid; // Total 36 karakter
	}

}
