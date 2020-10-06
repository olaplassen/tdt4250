/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.MyEcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyEcoreFactoryImpl extends EFactoryImpl implements MyEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyEcoreFactory init() {
		try {
			MyEcoreFactory theMyEcoreFactory = (MyEcoreFactory)EPackage.Registry.INSTANCE.getEFactory(MyEcorePackage.eNS_URI);
			if (theMyEcoreFactory != null) {
				return theMyEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MyEcorePackage.SCHOOL: return createSchool();
			case MyEcorePackage.PROGRAM: return createProgram();
			case MyEcorePackage.YEAR: return createYear();
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION: return createProgramWithNoSpecialication();
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION: return createProgramWithSpecialisation();
			case MyEcorePackage.SPECIALISATION: return createSpecialisation();
			case MyEcorePackage.SEMESTER: return createSemester();
			case MyEcorePackage.COURSE: return createCourse();
			case MyEcorePackage.STUDENT: return createStudent();
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN: return createIndividualStudyPlan();
			case MyEcorePackage.SELECTED_SEMESTER: return createSelectedSemester();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MyEcorePackage.SEMESTER_KIND:
				return createSemesterKindFromString(eDataType, initialValue);
			case MyEcorePackage.COURSE_LEVEL:
				return createCourseLevelFromString(eDataType, initialValue);
			case MyEcorePackage.COURSE_CODE:
				return createCourseCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MyEcorePackage.SEMESTER_KIND:
				return convertSemesterKindToString(eDataType, instanceValue);
			case MyEcorePackage.COURSE_LEVEL:
				return convertCourseLevelToString(eDataType, instanceValue);
			case MyEcorePackage.COURSE_CODE:
				return convertCourseCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School createSchool() {
		SchoolImpl school = new SchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramWithNoSpecialication createProgramWithNoSpecialication() {
		ProgramWithNoSpecialicationImpl programWithNoSpecialication = new ProgramWithNoSpecialicationImpl();
		return programWithNoSpecialication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramWithSpecialisation createProgramWithSpecialisation() {
		ProgramWithSpecialisationImpl programWithSpecialisation = new ProgramWithSpecialisationImpl();
		return programWithSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualStudyPlan createIndividualStudyPlan() {
		IndividualStudyPlanImpl individualStudyPlan = new IndividualStudyPlanImpl();
		return individualStudyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedSemester createSelectedSemester() {
		SelectedSemesterImpl selectedSemester = new SelectedSemesterImpl();
		return selectedSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterKind createSemesterKindFromString(EDataType eDataType, String initialValue) {
		SemesterKind result = SemesterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseLevel createCourseLevelFromString(EDataType eDataType, String initialValue) {
		CourseLevel result = CourseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
		if (! initialValue.matches("\\p{L}+\\d+")) {
			throw new IllegalArgumentException("Wrong Course code format");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEcorePackage getMyEcorePackage() {
		return (MyEcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyEcorePackage getPackage() {
		return MyEcorePackage.eINSTANCE;
	}

} //MyEcoreFactoryImpl
