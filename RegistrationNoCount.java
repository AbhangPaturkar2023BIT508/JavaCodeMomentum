/*
Develop a functionality to get the count of valid registration numbers from the given array. A valid registration number follows the format: YYYYDDDSSS, where:
- YYYY represents the year of enrollment (first four characters).
- DDD represents the department ID (next three characters).
- SSS represents the sequence number (next three characters).

Consider that only students from the Computer Science and Engineering (CSE), Information Technology (INFT), Chemical Engineering, and Mechanical Engineering departments are considered valid rest all are invalid. Please consider the corresponding departmental codes decided by SGGS administration while deciding the validity of the registration numbers.
*/
class RegistrationNoCount {
    /*
     * Function will return number of valid Registration number as int.
     * We pass String array as Argument to this function.
     */
    public int getValidRegistraionsCount(String registrationNumbers[]) {
        int validRegNoCount = 0; // Variable to count valid registration numbers
        String deptCode[] = { "BIT", "BCS", "BCH", "BME" }; // Initialize Department Code

        for (int i = 0; i < registrationNumbers.length; i++) {
            if (registrationNumbers[i] != null) { // Check for content is null or not
                char regNo[] = registrationNumbers[i].trim().toCharArray(); // Removing whiteSpaces of both side &
                                                                            // Converting string to char array
                if (regNo.length == 10) { // Check for Registration number length
                    boolean isCheckingValid = true;

                    // Checking first 4 characters (YYYY)are Digit or not
                    for (int j = 0; j < 4; j++) {
                        if (!Character.isDigit(regNo[j])) { // if not digit then return true
                            isCheckingValid = false;
                        }
                    }

                    // Here we checking whether the previous conditions is successfully passed or
                    // not.
                    if (isCheckingValid) {
                        // Check that YYYY is greater that or equal to 2000 and less than or equal to
                        // 2024
                        if (!(Integer.parseInt(String.valueOf(regNo, 0, 4)) >= 2000
                                && Integer.parseInt(String.valueOf(regNo, 0, 4)) <= 2024)) {
                            isCheckingValid = false;
                        }

                        // Here we checking whether the previous conditions is successfully passed or
                        // not.
                        if (isCheckingValid) {
                            String tempDeptCode = String.valueOf(regNo, 4, 3); // Store Department Code (DDD) from regNo
                            isCheckingValid = false;
                            // Checking for Department code (DDD) of regNo is valid or not
                            for (int j = 0; j < deptCode.length; j++) {
                                if (tempDeptCode.equalsIgnoreCase(deptCode[j])) { // Comparing Dept. Code in regNo is
                                                                                  // from our valid Dept. Code, if match
                                                                                  // then break
                                    isCheckingValid = true;
                                    break;
                                }
                            }

                            // Here we checking whether the previous conditions is successfully passed or
                            // not.
                            if (isCheckingValid) {
                                // Checking last 3 characters (SSS) are Digit or not
                                for (int j = 7; j < 10; j++) {
                                    if (!Character.isDigit(regNo[j])) { // if not digit then return true
                                        isCheckingValid = false;
                                    }
                                }

                                // Here we checking whether the previous conditions is successfully passed or
                                // not.
                                if (isCheckingValid) {
                                    validRegNoCount++; // Increase validRegNoCount if regNo is valid in
                                                       // format(YYYYDDDSSS).
                                }
                            }

                        }

                    }

                }
            }
        }

        return validRegNoCount; // Return validRegNoCount
    }

    public static void main(String args[]) {
        String arr[] = { "abcd508bit", "12bc5024", "34@#001", "2020bme501", null, "2024bit508", "1999bCs999" };
        SY2023bit508 obj = new SY2023bit508();
        int count = obj.getValidRegistraionsCount(arr);
        System.out.println(count);
    }
}