# Assignment2
Assignment from JavaPrep Course by Trevor Page

Assignment Overview(not my Assignment, its from Trevor Page)

The goal for this assignment is to read raw job data from a file and turn it into a well formatted and filtered list of jobs that are outputted to the console.

You should create a Job POJO that will store the information that will be read from the file.

The Job POJO should contain three properties:

  1. title
  2. company
  3. compensation

The file information should be stored in your Java application as an Array of Job objects.

Once this data is appropriately stored in your Java application, you can begin the process of filtering the data.


Filtering Data
Some of the jobs data is not fully complete and is missing the compensation information, we don't want to see this data in our final output. You job is to remove that data so it does not get shown in the final console output.



Program Design
The goal of this assignment is to start to use our own Classes and get comfortable with them.

You should make use of a JobService class that will help with things like removing the invalid data. You should also provide the service of reading the data from the file and creating the Jobs Array.

The rest of the logic can be held inside of a JobsFilteringApplication Class, which houses the "public static void main" method.


Sample Output
iOS/Android Mobile App Developer - Java, Swift
Freshop, Inc.
$88,000 - $103,000 a year

Security Engineer - Offensive Security
Indeed
$104,000 - $130,000 a year

Front End Developer - CSS/HTML/Vue
HiddenLevers
$80,000 - $130,000 a year

Core Java Developer- 034-21MJ
Combined Computer Resources
$75 - $85 an hour
Note: the sample output above only contains 4 jobs, your actual output will contain ALL the jobs (minus the ones that are missing compensation info.


Important Note about Output
One critical thing to note is that the output of your program should match exactly with what is shown above. Note the line breaks and how the job data is laid out, as well as the actual content of the job data (there are no double quotes cluttering the output).

If your output doesn't match exactly with what's shown above, then you'll need to keep working at fixing it.
