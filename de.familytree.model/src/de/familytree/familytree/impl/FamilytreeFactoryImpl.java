/**
 */
package de.familytree.familytree.impl;

import de.familytree.familytree.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilytreeFactoryImpl extends EFactoryImpl implements FamilytreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilytreeFactory init() {
		try {
			FamilytreeFactory theFamilytreeFactory = (FamilytreeFactory)EPackage.Registry.INSTANCE.getEFactory(FamilytreePackage.eNS_URI);
			if (theFamilytreeFactory != null) {
				return theFamilytreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FamilytreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilytreeFactoryImpl() {
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
			case FamilytreePackage.FAMILY_TREE: return createFamilyTree();
			case FamilytreePackage.WOMAN: return createWoman();
			case FamilytreePackage.MAN: return createMan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyTree createFamilyTree() {
		FamilyTreeImpl familyTree = new FamilyTreeImpl();
		return familyTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman createWoman() {
		WomanImpl woman = new WomanImpl();
		return woman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man createMan() {
		ManImpl man = new ManImpl();
		return man;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilytreePackage getFamilytreePackage() {
		return (FamilytreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FamilytreePackage getPackage() {
		return FamilytreePackage.eINSTANCE;
	}

} //FamilytreeFactoryImpl
