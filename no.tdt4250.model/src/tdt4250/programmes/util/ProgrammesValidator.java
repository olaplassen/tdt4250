/**
 */
package tdt4250.programmes.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;


import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import tdt4250.programmes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.programmes.ProgrammesPackage
 * @generated
 */
public class ProgrammesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProgrammesValidator INSTANCE = new ProgrammesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.programmes";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProgrammesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProgrammesPackage.SCHOOL:
				return validateSchool((School)value, diagnostics, context);
			case ProgrammesPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case ProgrammesPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case ProgrammesPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case ProgrammesPackage.PROGRAM_SEMESTER:
				return validateProgramSemester((ProgramSemester)value, diagnostics, context);
			case ProgrammesPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ProgrammesPackage.SEMESTER_KIND:
				return validateSemesterKind((SemesterKind)value, diagnostics, context);
			case ProgrammesPackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case ProgrammesPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			case ProgrammesPackage.NAME:
				return validateName((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchool(School school, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(school, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_correctYearFormat(year, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correctYearFormat constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__CORRECT_YEAR_FORMAT__EEXPRESSION = "self.year.size() == 4 AND self.year.matches('[0-9]')";

	/**
	 * Validates the correctYearFormat constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_correctYearFormat(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgrammesPackage.Literals.YEAR,
				 year,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "correctYearFormat",
				 YEAR__CORRECT_YEAR_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramSemester(ProgramSemester programSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programSemester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programSemester, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramSemester_courseTypeEqualsSemesterType(programSemester, diagnostics, context);
		return result;
	}
	/**
	 * The cached validation expression for the courseTypeEqualsSemesterType constraint of '<em>Program Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM_SEMESTER__COURSE_TYPE_EQUALS_SEMESTER_TYPE__EEXPRESSION = "if(self.specializations->size() < 1)  then (self.electiveCourses->forAll(course | course.courseSemesterType.value == self.SemesterKind.value)) else (self.specializations->forAll(specialization | specialization.semsters->forAll(semester | semester.electiveCourses->forAll(course | (course.courseSemesterType.value == semester.SemesterKind.value)))) endif";

	/**
	 * Validates the courseTypeEqualsSemesterType constraint of '<em>Program Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramSemester_courseTypeEqualsSemesterType(ProgramSemester programSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgrammesPackage.Literals.PROGRAM_SEMESTER,
				 programSemester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "courseTypeEqualsSemesterType",
				 PROGRAM_SEMESTER__COURSE_TYPE_EQUALS_SEMESTER_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}
	/**
	 * Validates the totalCreditsInSemster constraint of '<em>Program Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramSemester_totalCreditsInSemster(ProgramSemester programSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		double sumOfElectiveCredits = 0;
		double sumOfMandatoryCredits = 0;
		for (Course course : programSemester.getElectiveCourses()) {
			sumOfElectiveCredits += course.getCredits();
		}
		for (Course course : programSemester.getMandatoryCourses()) {
			sumOfMandatoryCredits += course.getCredits();
		}
		
		if ((sumOfElectiveCredits + sumOfMandatoryCredits) < 30) {
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "totalCreditsInSemster", getObjectLabel(programSemester, context) },
							 new Object[] { programSemester },
							 context));
				}
				return false;
			}
			return true;
		}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_correctCrtedit(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_hasCredit(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correctCrtedit constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_correctCrtedit(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float credit = course.getCredits();
		float availableCredit[] = {5.0f,7.5f,10.0f,15.0f,20.0f,25.0f,30.0f};
		boolean isCreditValid = false;
		
		
		for (int i = 0; i < availableCredit.length; i++) {
			if (credit == availableCredit[i]) {
				isCreditValid = true;
			}
		}
		if (isCreditValid) {		
			return true;
		}	
		
		if (diagnostics != null) {
			diagnostics.add
				(createDiagnostic
					(Diagnostic.ERROR,
					 DIAGNOSTIC_SOURCE,
					 0,
					 "_UI_GenericConstraint_diagnostic",
					 new Object[] { "correctCredit", getObjectLabel(course, context) },
					 new Object[] { course },
					 context));
		}
		return false;
		
	}

	/**
	 * The cached validation expression for the hasCredit constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__HAS_CREDIT__EEXPRESSION = "self.credits != null";

	/**
	 * Validates the hasCredit constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_hasCredit(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgrammesPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "hasCredit",
				 COURSE__HAS_CREDIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterKind(SemesterKind semesterKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCourseCode_Pattern(courseCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCourseCode_Pattern
	 */
	public static final  PatternMatcher [][] COURSE_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\p{L}+\\d+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Course Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode_Pattern(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ProgrammesPackage.Literals.COURSE_CODE, courseCode, COURSE_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_MinLength(name, diagnostics, context);
		if (result || diagnostics != null) result &= validateName_MaxLength(name, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_MinLength(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = name.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(ProgrammesPackage.Literals.NAME, name, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_MaxLength(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = name.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(ProgrammesPackage.Literals.NAME, name, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProgrammesValidator
