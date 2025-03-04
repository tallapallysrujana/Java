package cndaa;

import java.util.Scanner;

public class crc {

    // Function to perform XOR operation
    public static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();

        // XOR the two binary strings
        for (int i = 0; i < b.length(); i++) {
            result.append((a.charAt(i) == b.charAt(i)) ? '0' : '1');
        }
        return result.toString();
    }

    // Function to perform CRC encoding
    public static String crcEncode(String data, String divisor) {
        // Append zeros to the data
        int divisorLength = divisor.length();
        StringBuilder dataWithZeros = new StringBuilder(data);
        for (int i = 0; i < divisorLength - 1; i++) {
            dataWithZeros.append('0');
        }

        // Perform long division
        String temp = dataWithZeros.toString();
        StringBuilder remainder;
        while (temp.length() >= divisorLength) {
            if (temp.charAt(0) == '1') {
                remainder = new StringBuilder(temp.substring(0, divisorLength));
                remainder = new StringBuilder(xor(remainder.toString(), divisor));
                temp = remainder.toString() + temp.substring(divisorLength);
            } else {
                temp = temp.substring(1);
            }
        }
        return data + temp.substring(0, divisorLength - 1);
    }

    // Function to perform CRC decoding
    public static boolean crcDecode(String receivedData, String divisor) {
        int divisorLength = divisor.length();
        String temp = receivedData;

        // Perform long division to check if there is any remainder
        while (temp.length() >= divisorLength) {
            if (temp.charAt(0) == '1') {
                String remainder = temp.substring(0, divisorLength);
                remainder = xor(remainder, divisor);
                temp = remainder + temp.substring(divisorLength);
            } else {
                temp = temp.substring(1);
            }
        }

        // If the remainder is zero, the data is valid
        return temp.substring(0, divisorLength - 1).equals("0".repeat(divisorLength - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the input data and divisor from the user
        System.out.print("Enter the data (binary): ");
        String data = scanner.nextLine();

        System.out.print("Enter the divisor (binary): ");
        String divisor = scanner.nextLine();

        // CRC encoding
        String encodedData = crcEncode(data, divisor);
        System.out.println("Encoded Data (Data + CRC): " + encodedData);

        // CRC decoding
        System.out.print("Enter the received data (binary): ");
        String receivedData = scanner.nextLine();

        if (crcDecode(receivedData, divisor)) {
            System.out.println("Data is valid (No error detected).");
        } else {
            System.out.println("Data is invalid (Error detected).");
        }

        scanner.close();
    }
}
