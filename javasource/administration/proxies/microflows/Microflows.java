// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package administration.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Administration module
	public static void changeMyPassword(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("Administration.ChangeMyPassword").withParams(params).execute(context);
	}
	public static void changePassword(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("Administration.ChangePassword").withParams(params).execute(context);
	}
	public static void iVK_EditAccount(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("account", _account == null ? null : _account.getMendixObject());
		Core.microflowCall("Administration.IVK_EditAccount").withParams(params).execute(context);
	}
	public static void manageMyAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Administration.ManageMyAccount").withParams(params).execute(context);
	}
	public static void newAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Administration.NewAccount").withParams(params).execute(context);
	}
	/**
	 * Create a new user object and change the default attribute values so the user will be handled as a webservice user.
	 * Finally open the User_NewEdit form so all remaing user information can be set.
	 */
	public static void newWebServiceAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Administration.NewWebServiceAccount").withParams(params).execute(context);
	}
	public static java.util.List<system.proxies.TimeZone> retrieveTimeZones(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("Administration.RetrieveTimeZones").withParams(params).execute(context);
		java.util.List<system.proxies.TimeZone> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.TimeZone.initialize(context, obj));
		}
		return result;
	}
	public static void saveNewAccount(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("Administration.SaveNewAccount").withParams(params).execute(context);
	}
	public static void showMyPasswordForm(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Account", _account == null ? null : _account.getMendixObject());
		Core.microflowCall("Administration.ShowMyPasswordForm").withParams(params).execute(context);
	}
	public static void showPasswordForm(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Account", _account == null ? null : _account.getMendixObject());
		Core.microflowCall("Administration.ShowPasswordForm").withParams(params).execute(context);
	}
	public static boolean user_ValidateAccount(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("account", _account == null ? null : _account.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Administration.User_ValidateAccount").withParams(params).execute(context);
	}
	public static void userIVK_SaveAccountEdit(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("account", _account == null ? null : _account.getMendixObject());
		Core.microflowCall("Administration.UserIVK_SaveAccountEdit").withParams(params).execute(context);
	}
	public static void userIVK_SaveNewAccount(IContext context, administration.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("accountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("Administration.UserIVK_SaveNewAccount").withParams(params).execute(context);
	}
	public static boolean userValidateUserRole(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("account", _account == null ? null : _account.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Administration.UserValidateUserRole").withParams(params).execute(context);
	}
}