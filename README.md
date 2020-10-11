
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

Solution to this assignemnt is found under [/here](https://github.com/olaplassen/tdt4250/tree/master/no.tdt4250.model)
## Project Structure

### Ecore ([/model](https://github.com/olaplassen/tdt4250/tree/master/model))

My.ecore <br/>
The file describes the releationship between each entity as well as information about the entities themselces. There is also other information such as constraints. 

My.genmodel <br/>
This file uses the information from the ecore file to generate source code such as Java-classes of the modelled entities.

School.xmi<br/>
This file uses the model created in the ecore model to create instances of the entities and se the how the releations between them work.

## Code ([/src](https://github.com/olaplassen/tdt4250/tree/master/src/tdt4250/MyEcore))

The folder contains the code generated from the .genmodel file. The code that has been written manually or edited are marked with #generated NOT

#### /impl
Concrete implementation classes of the generated interfaces. 

#### /util
MyEcoreValidator has generated code but also manually written code for constraints. E.g constraint for name characters and for correct course credit.
## Model

### PlantUML

![model](https://github.com/olaplassen/tdt4250/blob/master/img/model.png)

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
