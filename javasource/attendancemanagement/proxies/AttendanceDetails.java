// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package attendancemanagement.proxies;

public class AttendanceDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attendanceDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AttendanceManagement.AttendanceDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Status("Status"),
		Date("Date"),
		CheckIn("CheckIn"),
		CheckOut("CheckOut"),
		TotalWorkingHours("TotalWorkingHours"),
		Title("Title"),
		AttendanceDetails_Account("AttendanceManagement.AttendanceDetails_Account");

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

	public AttendanceDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AttendanceManagement.AttendanceDetails"));
	}

	protected AttendanceDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attendanceDetailsMendixObject)
	{
		if (attendanceDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AttendanceManagement.AttendanceDetails", attendanceDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AttendanceManagement.AttendanceDetails");

		this.attendanceDetailsMendixObject = attendanceDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AttendanceDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static attendancemanagement.proxies.AttendanceDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return attendancemanagement.proxies.AttendanceDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static attendancemanagement.proxies.AttendanceDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new attendancemanagement.proxies.AttendanceDetails(context, mendixObject);
	}

	public static attendancemanagement.proxies.AttendanceDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return attendancemanagement.proxies.AttendanceDetails.initialize(context, mendixObject);
	}

	public static java.util.List<attendancemanagement.proxies.AttendanceDetails> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<attendancemanagement.proxies.AttendanceDetails> result = new java.util.ArrayList<attendancemanagement.proxies.AttendanceDetails>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AttendanceManagement.AttendanceDetails" + xpathConstraint))
			result.add(attendancemanagement.proxies.AttendanceDetails.initialize(context, obj));
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
	 * Set value of Status
	 * @param status
	 */
	public final attendancemanagement.proxies.PresentStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final attendancemanagement.proxies.PresentStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return attendancemanagement.proxies.PresentStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(attendancemanagement.proxies.PresentStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, attendancemanagement.proxies.PresentStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of CheckIn
	 */
	public final java.util.Date getCheckIn()
	{
		return getCheckIn(getContext());
	}

	/**
	 * @param context
	 * @return value of CheckIn
	 */
	public final java.util.Date getCheckIn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CheckIn.toString());
	}

	/**
	 * Set value of CheckIn
	 * @param checkin
	 */
	public final void setCheckIn(java.util.Date checkin)
	{
		setCheckIn(getContext(), checkin);
	}

	/**
	 * Set value of CheckIn
	 * @param context
	 * @param checkin
	 */
	public final void setCheckIn(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date checkin)
	{
		getMendixObject().setValue(context, MemberNames.CheckIn.toString(), checkin);
	}

	/**
	 * @return value of CheckOut
	 */
	public final java.util.Date getCheckOut()
	{
		return getCheckOut(getContext());
	}

	/**
	 * @param context
	 * @return value of CheckOut
	 */
	public final java.util.Date getCheckOut(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CheckOut.toString());
	}

	/**
	 * Set value of CheckOut
	 * @param checkout
	 */
	public final void setCheckOut(java.util.Date checkout)
	{
		setCheckOut(getContext(), checkout);
	}

	/**
	 * Set value of CheckOut
	 * @param context
	 * @param checkout
	 */
	public final void setCheckOut(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date checkout)
	{
		getMendixObject().setValue(context, MemberNames.CheckOut.toString(), checkout);
	}

	/**
	 * @return value of TotalWorkingHours
	 */
	public final java.math.BigDecimal getTotalWorkingHours()
	{
		return getTotalWorkingHours(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalWorkingHours
	 */
	public final java.math.BigDecimal getTotalWorkingHours(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalWorkingHours.toString());
	}

	/**
	 * Set value of TotalWorkingHours
	 * @param totalworkinghours
	 */
	public final void setTotalWorkingHours(java.math.BigDecimal totalworkinghours)
	{
		setTotalWorkingHours(getContext(), totalworkinghours);
	}

	/**
	 * Set value of TotalWorkingHours
	 * @param context
	 * @param totalworkinghours
	 */
	public final void setTotalWorkingHours(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalworkinghours)
	{
		getMendixObject().setValue(context, MemberNames.TotalWorkingHours.toString(), totalworkinghours);
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of AttendanceDetails_Account
	 */
	public final administration.proxies.Account getAttendanceDetails_Account() throws com.mendix.core.CoreException
	{
		return getAttendanceDetails_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of AttendanceDetails_Account
	 */
	public final administration.proxies.Account getAttendanceDetails_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AttendanceDetails_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AttendanceDetails_Account
	 * @param attendancedetails_account
	 */
	public final void setAttendanceDetails_Account(administration.proxies.Account attendancedetails_account)
	{
		setAttendanceDetails_Account(getContext(), attendancedetails_account);
	}

	/**
	 * Set value of AttendanceDetails_Account
	 * @param context
	 * @param attendancedetails_account
	 */
	public final void setAttendanceDetails_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account attendancedetails_account)
	{
		if (attendancedetails_account == null)
			getMendixObject().setValue(context, MemberNames.AttendanceDetails_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AttendanceDetails_Account.toString(), attendancedetails_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attendanceDetailsMendixObject;
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
			final attendancemanagement.proxies.AttendanceDetails that = (attendancemanagement.proxies.AttendanceDetails) obj;
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
		return "AttendanceManagement.AttendanceDetails";
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
