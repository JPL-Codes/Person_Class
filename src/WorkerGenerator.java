import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class WorkerGenerator {

        public static void main(String[] args){



            String firstName = "";
            String ID = "";
            String lastName = "";
            String title = "";
            int yob = 0;

            Scanner in = new Scanner(System.in);

            {
                ArrayList<String> workerCSVData = new ArrayList<>();
                boolean again = false;
                File workingDirectory = new File(System.getProperty("user.dir"));
                Path file = Paths.get(workingDirectory.getPath() + "\\src\\workerTestData.txt");
                do {


                    firstName = SafeInput.getNonZeroLenString(in, "Enter the first name");
                    lastName = SafeInput.getNonZeroLenString(in, "Enter the last name");
                    ID = SafeInput.getNonZeroLenString(in, "Enter the ID as 6 digits");
                    title = SafeInput.getNonZeroLenString(in, "Enter the title");
                    yob = SafeInput.getRangedInt(in, "Enter the year of birth as 4 digits", 1940, 2000);

                    String CSVWorkerRecord = (firstName + "," + lastName + ","+ID + ","  + title + "," + yob);
                    workerCSVData.add(CSVWorkerRecord);

                    again = SafeInput.getYNConfirm(in, "Are you done entering prompts?");


                } while (!again);

                for (String p : workerCSVData)

                    try {
                        // Typical java pattern of inherited classes
                        // we wrap a BufferedWriter around a lower level BufferedOutputStream
                        OutputStream out =
                                new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                        BufferedWriter writer =
                                new BufferedWriter(new OutputStreamWriter(out));

                        for (String rec : workerCSVData) {
                            writer.write(rec, 0, rec.length());
                            writer.newLine();
                            writer.newLine();// adds the new line

                        }
                        writer.close(); // must close the file to seal it and flush buffer
                        System.out.println("Data file written!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


            }}
    }

