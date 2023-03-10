// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package imagecreator.proxies;

public class Data
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImageCreator.Data";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Data_Root("ImageCreator.Data_Root");

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

	public Data(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImageCreator.Data"));
	}

	protected Data(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dataMendixObject)
	{
		if (dataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ImageCreator.Data", dataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImageCreator.Data");

		this.dataMendixObject = dataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Data.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static imagecreator.proxies.Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return imagecreator.proxies.Data.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static imagecreator.proxies.Data initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new imagecreator.proxies.Data(context, mendixObject);
	}

	public static imagecreator.proxies.Data load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return imagecreator.proxies.Data.initialize(context, mendixObject);
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
	 * @return value of Data_Root
	 */
	public final imagecreator.proxies.Root getData_Root() throws com.mendix.core.CoreException
	{
		return getData_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Data_Root
	 */
	public final imagecreator.proxies.Root getData_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		imagecreator.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Data_Root.toString());
		if (identifier != null)
			result = imagecreator.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Data_Root
	 * @param data_root
	 */
	public final void setData_Root(imagecreator.proxies.Root data_root)
	{
		setData_Root(getContext(), data_root);
	}

	/**
	 * Set value of Data_Root
	 * @param context
	 * @param data_root
	 */
	public final void setData_Root(com.mendix.systemwideinterfaces.core.IContext context, imagecreator.proxies.Root data_root)
	{
		if (data_root == null)
			getMendixObject().setValue(context, MemberNames.Data_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Data_Root.toString(), data_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dataMendixObject;
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
			final imagecreator.proxies.Data that = (imagecreator.proxies.Data) obj;
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
		return "ImageCreator.Data";
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
