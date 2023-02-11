// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package attendancemanagement.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the AttendanceManagement module
	public static void iVK_ShowCalenderPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AttendanceManagement.IVK_ShowCalenderPage").withParams(params).execute(context);
	}
	public static void onClickApprovalButton(IContext context, attendancemanagement.proxies.LeaveRequestInfo _leaveRequestInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("LeaveRequestInfo", _leaveRequestInfo == null ? null : _leaveRequestInfo.getMendixObject());
		Core.microflowCall("AttendanceManagement.OnClickApprovalButton").withParams(params).execute(context);
	}
	public static void onClickCheckInButton(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AttendanceManagement.OnClickCheckInButton").withParams(params).execute(context);
	}
	public static void onClickCheckOutButton(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AttendanceManagement.OnClickCheckOutButton").withParams(params).execute(context);
	}
	public static void onClickDenyButton(IContext context, attendancemanagement.proxies.LeaveRequestInfo _leaveRequestInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("LeaveRequestInfo", _leaveRequestInfo == null ? null : _leaveRequestInfo.getMendixObject());
		Core.microflowCall("AttendanceManagement.OnClickDenyButton").withParams(params).execute(context);
	}
	public static void saveLeaveRequest(IContext context, attendancemanagement.proxies.LeaveRequestInfo _leaveRequestInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("leaveRequestInfo", _leaveRequestInfo == null ? null : _leaveRequestInfo.getMendixObject());
		Core.microflowCall("AttendanceManagement.SaveLeaveRequest").withParams(params).execute(context);
	}
	public static void showAttendanceDetailsPage(IContext context, attendancemanagement.proxies.AttendanceDetails _attendanceDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("attendanceDetails", _attendanceDetails == null ? null : _attendanceDetails.getMendixObject());
		Core.microflowCall("AttendanceManagement.ShowAttendanceDetailsPage").withParams(params).execute(context);
	}
	public static void showLeaveBalancePage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AttendanceManagement.ShowLeaveBalancePage").withParams(params).execute(context);
	}
	public static void showLeaveRequestPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AttendanceManagement.ShowLeaveRequestPage").withParams(params).execute(context);
	}
	public static boolean vAL_ValidateLeaveRequest(IContext context, attendancemanagement.proxies.LeaveRequestInfo _leaveRequestInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("leaveRequestInfo", _leaveRequestInfo == null ? null : _leaveRequestInfo.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("AttendanceManagement.VAL_ValidateLeaveRequest").withParams(params).execute(context);
	}
}