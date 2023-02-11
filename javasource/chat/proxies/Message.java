// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package chat.proxies;

public class Message
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Chat.Message";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Text("Text"),
		Message_Account_Sender("Chat.Message_Account_Sender"),
		Message_Account_Reciever("Chat.Message_Account_Reciever");

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

	public Message(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Chat.Message"));
	}

	protected Message(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject)
	{
		if (messageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Chat.Message", messageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Chat.Message");

		this.messageMendixObject = messageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Message.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static chat.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return chat.proxies.Message.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static chat.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new chat.proxies.Message(context, mendixObject);
	}

	public static chat.proxies.Message load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return chat.proxies.Message.initialize(context, mendixObject);
	}

	public static java.util.List<chat.proxies.Message> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<chat.proxies.Message> result = new java.util.ArrayList<chat.proxies.Message>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Chat.Message" + xpathConstraint))
			result.add(chat.proxies.Message.initialize(context, obj));
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
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of Message_Account_Sender
	 */
	public final administration.proxies.Account getMessage_Account_Sender() throws com.mendix.core.CoreException
	{
		return getMessage_Account_Sender(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_Account_Sender
	 */
	public final administration.proxies.Account getMessage_Account_Sender(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Message_Account_Sender.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Message_Account_Sender
	 * @param message_account_sender
	 */
	public final void setMessage_Account_Sender(administration.proxies.Account message_account_sender)
	{
		setMessage_Account_Sender(getContext(), message_account_sender);
	}

	/**
	 * Set value of Message_Account_Sender
	 * @param context
	 * @param message_account_sender
	 */
	public final void setMessage_Account_Sender(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account message_account_sender)
	{
		if (message_account_sender == null)
			getMendixObject().setValue(context, MemberNames.Message_Account_Sender.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Message_Account_Sender.toString(), message_account_sender.getMendixObject().getId());
	}

	/**
	 * @return value of Message_Account_Reciever
	 */
	public final administration.proxies.Account getMessage_Account_Reciever() throws com.mendix.core.CoreException
	{
		return getMessage_Account_Reciever(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_Account_Reciever
	 */
	public final administration.proxies.Account getMessage_Account_Reciever(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Message_Account_Reciever.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Message_Account_Reciever
	 * @param message_account_reciever
	 */
	public final void setMessage_Account_Reciever(administration.proxies.Account message_account_reciever)
	{
		setMessage_Account_Reciever(getContext(), message_account_reciever);
	}

	/**
	 * Set value of Message_Account_Reciever
	 * @param context
	 * @param message_account_reciever
	 */
	public final void setMessage_Account_Reciever(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account message_account_reciever)
	{
		if (message_account_reciever == null)
			getMendixObject().setValue(context, MemberNames.Message_Account_Reciever.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Message_Account_Reciever.toString(), message_account_reciever.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return messageMendixObject;
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
			final chat.proxies.Message that = (chat.proxies.Message) obj;
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
		return "Chat.Message";
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
