/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.center.control;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 05-19-2007
 * 
 * XDoclet definition:
 * @struts.form name="shoppingForm"
 */
public class ShoppingForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** goodid property */
	private int goodid;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the goodid.
	 * @return int
	 */
	public int getGoodid() {
		return goodid;
	}

	/** 
	 * Set the goodid.
	 * @param goodid The goodid to set
	 */
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
}