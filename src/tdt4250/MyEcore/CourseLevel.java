/**
 */
package tdt4250.MyEcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.MyEcore.MyEcorePackage#getCourseLevel()
 * @model
 * @generated
 */
public enum CourseLevel implements Enumerator {
	/**
	 * The '<em><b>Higher Grade Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_GRADE_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHER_GRADE_LEVEL(0, "HigherGradeLevel", "HigherGradeLevel"),

	/**
	 * The '<em><b>Third Year Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_YEAR_LEVEL(0, "ThirdYearLevel", "ThirdYearLevel");

	/**
	 * The '<em><b>Higher Grade Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_GRADE_LEVEL
	 * @model name="HigherGradeLevel"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHER_GRADE_LEVEL_VALUE = 0;

	/**
	 * The '<em><b>Third Year Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_LEVEL
	 * @model name="ThirdYearLevel"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_YEAR_LEVEL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseLevel[] VALUES_ARRAY =
		new CourseLevel[] {
			HIGHER_GRADE_LEVEL,
			THIRD_YEAR_LEVEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(int value) {
		switch (value) {
			case HIGHER_GRADE_LEVEL_VALUE: return HIGHER_GRADE_LEVEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CourseLevel
