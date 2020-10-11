/**
 */
package tdt4250.programmes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdt4250.programmes.ProgramSemester;
import tdt4250.programmes.ProgrammesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramSemesterTest extends TestCase {

	/**
	 * The fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgramSemesterTest.class);
	}

	/**
	 * Constructs a new Program Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProgramSemester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Program Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemester getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProgrammesFactory.eINSTANCE.createProgramSemester());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProgramSemesterTest
