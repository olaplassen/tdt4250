
# TDT4250 Avasert Programvaredesign

This project is a possible solution for the first and second assignment in the course TDT4250

## Case

The case is to model a school institution with everything from courses, semesters, programs, specialications and individual studyplans.
The first Assignment was to get expereience with the aspects of Ecore-modelling and code generation. The following was supposed to be implemented:

- Study Plans with semesters, courses, and gropus of courses
- Specializations inside programmes
- Classes and datatypes
- Attributes and references
- Constraints

Solution to this assignemnt is found under this folder [/no.tdt4250.model](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.model)

The goal of the second assignment was to get experience with transformations, the task is to implement a transformation from (an instance of) the model from assignment 1 to a web page corresponding to the study program pages. I decided to use an (M2T) transformation with the M2T language Acceleo. Solution to the assignment can be found under this folder: [/no.tdt4250.m2t](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.m2t)


## Project Structure

### Ecore ([/model](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.model/model))

programmes.ecore <br/>
The file describes the releationship between each entity as well as information about the entities themselces. There is also other information such as constraints. 

programmes.genmodel <br/>
This file uses the information from the ecore file to generate source code such as Java-classes of the modelled entities.

School.xmi<br/>
This file uses the model created in the ecore model to create instances of the entities and se the how the releations between them work.

## Code ([/src](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.model/src/tdt4250/programmes))

The folder contains the code generated from the .genmodel file. The code that has been written manually or edited are marked with #generated NOT

#### /impl
Concrete implementation classes of the generated interfaces. 

#### /util
MyEcoreValidator has generated code but also manually written code for constraints. E.g constraint for name characters and for correct course credit.


### Constraints implemented

- [x] Correct Year Format
- [x] Course Type Equals Semester type e.g. Fall Course can only be in an Fall semster
- [x] Credit in Course can only be spesific values
- [x] Datatype constraint "Name" to set min and max lengths for several string values
- [x] Datatytpe constraint for course code with regex pattern
- [ ] Same course code can not be inside same semster

# Changes to the model

From assigment 1 several changes was made to the model. To simplify the M2T transformation and because i had trouble finding a workable solution to the Individual studyplan task this was removed and changes were made to to how specilizations inside programmes worked.

Se the old model pictured below:


![model](https://github.com/olaplassen/tdt4250/blob/master/div/old_model.png)

| ENTITY | DESCRIPTION |
| ------------- | ------------- |
| School  | Top level entity and includes multiple Programs and Students |
| Program  | Consists of a name and a credit requirement  |
| ProgramWithNoSpecialication  | Has Program as its super entity and a list of year-entities  |
| ProgramWithSpecialication  | Has Program as its super entity and a list of year-entities   |
| Year | Programs with and without specialications may have multiple starting years and may change over the years, e.g new courses and more specialications.  |
| Specialication  | List of all possible spescialisations in that program. Links to itself so it is possible for a program to chooce specialications several times though the program |
| Semester  | Contains mandatory and elective courses as well as a year and SemsterKind that tells if it is a Fall or autumn semster |
| Course  | Consists of a code, credit, level and semesterkind to tell when it is tought |
| Student  | Consists of a name, email and an id and has one studyplan  |
| IndividualStudyPlan | Has an attribute for results and links to the selected semsters  |
| SelectedSemester | Here will the student be able to chooce among the selected semsters for its program. <b>NOTE</b>: still a lot of work to be done on the individual studyplan "line"  |

New Model IMG <br/>

| ENTITY | DESCRIPTION |
| ------------- | ------------- |
| School  | Top level entity and includes multiple Programs |
| Program  | Consists of a name and a credit requirement, has one school and several ProgramYears  |
| Year | The conent of a program can change through time and it has several starting years. The conntent of Program and can change with the Year  Class  |
| ProgramSemester  | Contains mandatory and elective courses as well as a year and SemsterKind that tells if it is a Fall or Spring semester. It can contain specializations if the program has specialisations choices in spesific semsters. If the programSemster cotaints inside and specialisation "Current specialisation" is populated. If it contains inside a Year, "Program Year" Is populated. This is done with opposite links. |
| Specialication  | Inside a ProgramSemster. Contains semsters and has "Specializes In" Populated from the "Program" Class. |
| Course  | Consists of a code, credit, level and semesterkind to tell when it is tought |

# Assignment 2 - Running the transformation

To run the transformation simply right click on the [/generate.mtl](https://github.com/olaplassen/tdt4250/blob/master/no.tdt4250.m2t/src/no/tdt4250/m2t/main/generate.mtl) file and click "Run as.." -> "Run Configurations". <br/>
Add the details as shown in the image below and click run. The generated content is available inside the [/dst_content](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.m2t/dst_code) folder. There the generated html file with the generated instance of my modelm lies as well as the css file used.

