package cndaa;
import java.util.Scanner;

public class hammingcode {



        static int[] calculateParityBits(int[] bits, int r) {
            int[] parityBits = new int[r];
            for (int i = 0; i < r; i++) {
                int parity = 0;
                // Determine parity bits for each position
                for (int j = 0; j < bits.length; j++) {
                    if (((j + 1) & (1 << i)) != 0) {
                        parity ^= bits[j];
                    }
                }
                parityBits[i] = parity;
            }
            return parityBits;
        }

        // Function to insert the parity bits into the original data
        static int[] insertParityBits(int[] dataBits, int[] parityBits, int r) {
            int n = dataBits.length + r;
            int[] hammingCode = new int[n];

            int j = 0, k = 0;

            // Insert data and parity bits into the Hamming code
            for (int i = 0; i < n; i++) {
                if ((i & (i + 1)) == 0) {
                    hammingCode[i] = parityBits[j++];
                } else {
                    hammingCode[i] = dataBits[k++];
                }
            }
            return hammingCode;
        }

        // Function to check and correct the received code
        static void checkAndCorrect(int[] receivedCode, int r) {
            int n = receivedCode.length;
            int[] parityCheck = new int[r];

            // Calculate the parity checks
            for (int i = 0; i < r; i++) {
                int parity = 0;
                for (int j = 0; j < n; j++) {
                    if (((j + 1) & (1 << i)) != 0) {
                        parity ^= receivedCode[j];
                    }
                }
                parityCheck[i] = parity;
            }

            // Check if there is any error
            int errorPosition = 0;
            for (int i = 0; i < r; i++) {
                errorPosition |= (parityCheck[i] << i);
            }

            if (errorPosition != 0) {
                System.out.println("Error detected at position: " + errorPosition);
                // Correct the error
                receivedCode[errorPosition - 1] ^= 1;
                System.out.println("Corrected Code: ");
                for (int i : receivedCode) {
                    System.out.print(i);
                }
                System.out.println();
            } else {
                System.out.println("No error detected.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input data bits
            System.out.println("Enter 4 data bits (0 or 1): ");
            int[] dataBits = new int[4];
            for (int i = 0; i < 4; i++) {
                dataBits[i] = scanner.nextInt();
            }

            // Calculate the number of parity bits
            int r = 3; // For Hamming(7,4), we need 3 parity bits
            int[] parityBits = calculateParityBits(dataBits, r);

            // Generate the Hamming code
            int[] hammingCode = insertParityBits(dataBits, parityBits, r);

            System.out.println("Generated Hamming Code: ");
            for (int i : hammingCode) {
                System.out.print(i);
            }
            System.out.println();

            // Input received code (possibly with errors)
            System.out.println("Enter the received code (7 bits): ");
            int[] receivedCode = new int[7];
            for (int i = 0; i < 7; i++) {
                receivedCode[i] = scanner.nextInt();
            }

            // Check and correct errors in the received code
            checkAndCorrect(receivedCode, r);

            scanner.close();
        }
    }
