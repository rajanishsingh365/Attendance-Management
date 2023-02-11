// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package imagecreator.proxies;

public class ImageObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject imageObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImageCreator.ImageObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Url("Url"),
		ImageObject_Data("ImageCreator.ImageObject_Data");

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

	public ImageObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImageCreator.ImageObject"));
	}

	protected ImageObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageObjectMendixObject)
	{
		if (imageObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ImageCreator.ImageObject", imageObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImageCreator.ImageObject");

		this.imageObjectMendixObject = imageObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ImageObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static imagecreator.proxies.ImageObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return imagecreator.proxies.ImageObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static imagecreator.proxies.ImageObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new imagecreator.proxies.ImageObject(context, mendixObject);
	}

	public static imagecreator.proxies.ImageObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return imagecreator.proxies.ImageObject.initialize(context, mendixObject);
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
	 * @return value of Url
	 */
	public final java.lang.String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final java.lang.String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(java.lang.String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @return value of ImageObject_Data
	 */
	public final imagecreator.proxies.Data getImageObject_Data() throws com.mendix.core.CoreException
	{
		return getImageObject_Data(getContext());
	}

	/**
	 * @param context
	 * @return value of ImageObject_Data
	 */
	public final imagecreator.proxies.Data getImageObject_Data(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		imagecreator.proxies.Data result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ImageObject_Data.toString());
		if (identifier != null)
			result = imagecreator.proxies.Data.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ImageObject_Data
	 * @param imageobject_data
	 */
	public final void setImageObject_Data(imagecreator.proxies.Data imageobject_data)
	{
		setImageObject_Data(getContext(), imageobject_data);
	}

	/**
	 * Set value of ImageObject_Data
	 * @param context
	 * @param imageobject_data
	 */
	public final void setImageObject_Data(com.mendix.systemwideinterfaces.core.IContext context, imagecreator.proxies.Data imageobject_data)
	{
		if (imageobject_data == null)
			getMendixObject().setValue(context, MemberNames.ImageObject_Data.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ImageObject_Data.toString(), imageobject_data.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return imageObjectMendixObject;
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
			final imagecreator.proxies.ImageObject that = (imagecreator.proxies.ImageObject) obj;
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
		return "ImageCreator.ImageObject";
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
