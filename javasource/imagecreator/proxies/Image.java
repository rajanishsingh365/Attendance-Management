// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package imagecreator.proxies;

public class Image
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject imageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ImageCreator.Image";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ImageDetails("ImageDetails"),
		NumberOfImages("NumberOfImages"),
		Size("Size");

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

	public Image(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ImageCreator.Image"));
	}

	protected Image(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject imageMendixObject)
	{
		if (imageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ImageCreator.Image", imageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ImageCreator.Image");

		this.imageMendixObject = imageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Image.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static imagecreator.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return imagecreator.proxies.Image.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static imagecreator.proxies.Image initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new imagecreator.proxies.Image(context, mendixObject);
	}

	public static imagecreator.proxies.Image load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return imagecreator.proxies.Image.initialize(context, mendixObject);
	}

	public static java.util.List<imagecreator.proxies.Image> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<imagecreator.proxies.Image> result = new java.util.ArrayList<imagecreator.proxies.Image>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ImageCreator.Image" + xpathConstraint))
			result.add(imagecreator.proxies.Image.initialize(context, obj));
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
	 * @return value of ImageDetails
	 */
	public final java.lang.String getImageDetails()
	{
		return getImageDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of ImageDetails
	 */
	public final java.lang.String getImageDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ImageDetails.toString());
	}

	/**
	 * Set value of ImageDetails
	 * @param imagedetails
	 */
	public final void setImageDetails(java.lang.String imagedetails)
	{
		setImageDetails(getContext(), imagedetails);
	}

	/**
	 * Set value of ImageDetails
	 * @param context
	 * @param imagedetails
	 */
	public final void setImageDetails(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String imagedetails)
	{
		getMendixObject().setValue(context, MemberNames.ImageDetails.toString(), imagedetails);
	}

	/**
	 * @return value of NumberOfImages
	 */
	public final java.lang.Integer getNumberOfImages()
	{
		return getNumberOfImages(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfImages
	 */
	public final java.lang.Integer getNumberOfImages(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfImages.toString());
	}

	/**
	 * Set value of NumberOfImages
	 * @param numberofimages
	 */
	public final void setNumberOfImages(java.lang.Integer numberofimages)
	{
		setNumberOfImages(getContext(), numberofimages);
	}

	/**
	 * Set value of NumberOfImages
	 * @param context
	 * @param numberofimages
	 */
	public final void setNumberOfImages(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofimages)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfImages.toString(), numberofimages);
	}

	/**
	 * @return value of Size
	 */
	public final java.lang.String getSize()
	{
		return getSize(getContext());
	}

	/**
	 * @param context
	 * @return value of Size
	 */
	public final java.lang.String getSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Size.toString());
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final void setSize(java.lang.String size)
	{
		setSize(getContext(), size);
	}

	/**
	 * Set value of Size
	 * @param context
	 * @param size
	 */
	public final void setSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String size)
	{
		getMendixObject().setValue(context, MemberNames.Size.toString(), size);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return imageMendixObject;
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
			final imagecreator.proxies.Image that = (imagecreator.proxies.Image) obj;
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
		return "ImageCreator.Image";
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