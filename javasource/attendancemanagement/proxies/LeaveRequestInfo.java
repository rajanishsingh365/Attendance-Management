// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package attendancemanagement.proxies;

public class LeaveRequestInfo
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject leaveRequestInfoMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AttendanceManagement.LeaveRequestInfo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartDate("StartDate"),
		EndDate("EndDate"),
		LeaveType("LeaveType"),
		Comments("Comments"),
		IsApproved("IsApproved"),
		IsDeny("IsDeny"),
		LeaveStatus("LeaveStatus"),
		NumberOfDays("NumberOfDays"),
		LeaveRequestInfo_Account("AttendanceManagement.LeaveRequestInfo_Account");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public LeaveRequestInfo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AttendanceManagement.LeaveRequestInfo"));
	}

	protected LeaveRequestInfo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject leaveRequestInfoMendixObject)
	{
		if (leaveRequestInfoMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AttendanceManagement.LeaveRequestInfo", leaveRequestInfoMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AttendanceManagement.LeaveRequestInfo");

		this.leaveRequestInfoMendixObject = leaveRequestInfoMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LeaveRequestInfo.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static attendancemanagement.proxies.LeaveRequestInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return attendancemanagement.proxies.LeaveRequestInfo.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static attendancemanagement.proxies.LeaveRequestInfo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new attendancemanagement.proxies.LeaveRequestInfo(context, mendixObject);
	}

	public static attendancemanagement.proxies.LeaveRequestInfo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return attendancemanagement.proxies.LeaveRequestInfo.initialize(context, mendixObject);
	}

	public static java.util.List<attendancemanagement.proxies.LeaveRequestInfo> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<attendancemanagement.proxies.LeaveRequestInfo> result = new java.util.ArrayList<attendancemanagement.proxies.LeaveRequestInfo>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AttendanceManagement.LeaveRequestInfo" + xpathConstraint))
			result.add(attendancemanagement.proxies.LeaveRequestInfo.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * Set value of LeaveType
	 * @param leavetype
	 */
	public final attendancemanagement.proxies.LeaveType getLeaveType()
	{
		return getLeaveType(getContext());
	}

	/**
	 * @param context
	 * @return value of LeaveType
	 */
	public final attendancemanagement.proxies.LeaveType getLeaveType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LeaveType.toString());
		if (obj == null)
			return null;

		return attendancemanagement.proxies.LeaveType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LeaveType
	 * @param leavetype
	 */
	public final void setLeaveType(attendancemanagement.proxies.LeaveType leavetype)
	{
		setLeaveType(getContext(), leavetype);
	}

	/**
	 * Set value of LeaveType
	 * @param context
	 * @param leavetype
	 */
	public final void setLeaveType(com.mendix.systemwideinterfaces.core.IContext context, attendancemanagement.proxies.LeaveType leavetype)
	{
		if (leavetype != null)
			getMendixObject().setValue(context, MemberNames.LeaveType.toString(), leavetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.LeaveType.toString(), null);
	}

	/**
	 * @return value of Comments
	 */
	public final java.lang.String getComments()
	{
		return getComments(getContext());
	}

	/**
	 * @param context
	 * @return value of Comments
	 */
	public final java.lang.String getComments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Comments.toString());
	}

	/**
	 * Set value of Comments
	 * @param comments
	 */
	public final void setComments(java.lang.String comments)
	{
		setComments(getContext(), comments);
	}

	/**
	 * Set value of Comments
	 * @param context
	 * @param comments
	 */
	public final void setComments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String comments)
	{
		getMendixObject().setValue(context, MemberNames.Comments.toString(), comments);
	}

	/**
	 * @return value of IsApproved
	 */
	public final java.lang.Boolean getIsApproved()
	{
		return getIsApproved(getContext());
	}

	/**
	 * @param context
	 * @return value of IsApproved
	 */
	public final java.lang.Boolean getIsApproved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsApproved.toString());
	}

	/**
	 * Set value of IsApproved
	 * @param isapproved
	 */
	public final void setIsApproved(java.lang.Boolean isapproved)
	{
		setIsApproved(getContext(), isapproved);
	}

	/**
	 * Set value of IsApproved
	 * @param context
	 * @param isapproved
	 */
	public final void setIsApproved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isapproved)
	{
		getMendixObject().setValue(context, MemberNames.IsApproved.toString(), isapproved);
	}

	/**
	 * @return value of IsDeny
	 */
	public final java.lang.Boolean getIsDeny()
	{
		return getIsDeny(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDeny
	 */
	public final java.lang.Boolean getIsDeny(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsDeny.toString());
	}

	/**
	 * Set value of IsDeny
	 * @param isdeny
	 */
	public final void setIsDeny(java.lang.Boolean isdeny)
	{
		setIsDeny(getContext(), isdeny);
	}

	/**
	 * Set value of IsDeny
	 * @param context
	 * @param isdeny
	 */
	public final void setIsDeny(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isdeny)
	{
		getMendixObject().setValue(context, MemberNames.IsDeny.toString(), isdeny);
	}

	/**
	 * Set value of LeaveStatus
	 * @param leavestatus
	 */
	public final attendancemanagement.proxies.LeaveStatus getLeaveStatus()
	{
		return getLeaveStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of LeaveStatus
	 */
	public final attendancemanagement.proxies.LeaveStatus getLeaveStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.LeaveStatus.toString());
		if (obj == null)
			return null;

		return attendancemanagement.proxies.LeaveStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of LeaveStatus
	 * @param leavestatus
	 */
	public final void setLeaveStatus(attendancemanagement.proxies.LeaveStatus leavestatus)
	{
		setLeaveStatus(getContext(), leavestatus);
	}

	/**
	 * Set value of LeaveStatus
	 * @param context
	 * @param leavestatus
	 */
	public final void setLeaveStatus(com.mendix.systemwideinterfaces.core.IContext context, attendancemanagement.proxies.LeaveStatus leavestatus)
	{
		if (leavestatus != null)
			getMendixObject().setValue(context, MemberNames.LeaveStatus.toString(), leavestatus.toString());
		else
			getMendixObject().setValue(context, MemberNames.LeaveStatus.toString(), null);
	}

	/**
	 * @return value of NumberOfDays
	 */
	public final java.math.BigDecimal getNumberOfDays()
	{
		return getNumberOfDays(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfDays
	 */
	public final java.math.BigDecimal getNumberOfDays(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.NumberOfDays.toString());
	}

	/**
	 * Set value of NumberOfDays
	 * @param numberofdays
	 */
	public final void setNumberOfDays(java.math.BigDecimal numberofdays)
	{
		setNumberOfDays(getContext(), numberofdays);
	}

	/**
	 * Set value of NumberOfDays
	 * @param context
	 * @param numberofdays
	 */
	public final void setNumberOfDays(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal numberofdays)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfDays.toString(), numberofdays);
	}

	/**
	 * @return value of LeaveRequestInfo_Account
	 */
	public final administration.proxies.Account getLeaveRequestInfo_Account() throws com.mendix.core.CoreException
	{
		return getLeaveRequestInfo_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of LeaveRequestInfo_Account
	 */
	public final administration.proxies.Account getLeaveRequestInfo_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LeaveRequestInfo_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LeaveRequestInfo_Account
	 * @param leaverequestinfo_account
	 */
	public final void setLeaveRequestInfo_Account(administration.proxies.Account leaverequestinfo_account)
	{
		setLeaveRequestInfo_Account(getContext(), leaverequestinfo_account);
	}

	/**
	 * Set value of LeaveRequestInfo_Account
	 * @param context
	 * @param leaverequestinfo_account
	 */
	public final void setLeaveRequestInfo_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account leaverequestinfo_account)
	{
		if (leaverequestinfo_account == null)
			getMendixObject().setValue(context, MemberNames.LeaveRequestInfo_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LeaveRequestInfo_Account.toString(), leaverequestinfo_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return leaveRequestInfoMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final attendancemanagement.proxies.LeaveRequestInfo that = (attendancemanagement.proxies.LeaveRequestInfo) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "AttendanceManagement.LeaveRequestInfo";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}