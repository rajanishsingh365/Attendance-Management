// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package chatbot.proxies;

public class Chat
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject chatMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ChatBot.Chat";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Question("Question"),
		Answer("Answer"),
		Chat_Account("ChatBot.Chat_Account");

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

	public Chat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ChatBot.Chat"));
	}

	protected Chat(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject chatMendixObject)
	{
		if (chatMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ChatBot.Chat", chatMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ChatBot.Chat");

		this.chatMendixObject = chatMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Chat.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static chatbot.proxies.Chat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return chatbot.proxies.Chat.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static chatbot.proxies.Chat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new chatbot.proxies.Chat(context, mendixObject);
	}

	public static chatbot.proxies.Chat load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return chatbot.proxies.Chat.initialize(context, mendixObject);
	}

	public static java.util.List<chatbot.proxies.Chat> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<chatbot.proxies.Chat> result = new java.util.ArrayList<chatbot.proxies.Chat>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ChatBot.Chat" + xpathConstraint))
			result.add(chatbot.proxies.Chat.initialize(context, obj));
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
	 * @return value of Question
	 */
	public final java.lang.String getQuestion()
	{
		return getQuestion(getContext());
	}

	/**
	 * @param context
	 * @return value of Question
	 */
	public final java.lang.String getQuestion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Question.toString());
	}

	/**
	 * Set value of Question
	 * @param question
	 */
	public final void setQuestion(java.lang.String question)
	{
		setQuestion(getContext(), question);
	}

	/**
	 * Set value of Question
	 * @param context
	 * @param question
	 */
	public final void setQuestion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String question)
	{
		getMendixObject().setValue(context, MemberNames.Question.toString(), question);
	}

	/**
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer()
	{
		return getAnswer(getContext());
	}

	/**
	 * @param context
	 * @return value of Answer
	 */
	public final java.lang.String getAnswer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Answer.toString());
	}

	/**
	 * Set value of Answer
	 * @param answer
	 */
	public final void setAnswer(java.lang.String answer)
	{
		setAnswer(getContext(), answer);
	}

	/**
	 * Set value of Answer
	 * @param context
	 * @param answer
	 */
	public final void setAnswer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String answer)
	{
		getMendixObject().setValue(context, MemberNames.Answer.toString(), answer);
	}

	/**
	 * @return value of Chat_Account
	 */
	public final administration.proxies.Account getChat_Account() throws com.mendix.core.CoreException
	{
		return getChat_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Chat_Account
	 */
	public final administration.proxies.Account getChat_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Chat_Account.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Chat_Account
	 * @param chat_account
	 */
	public final void setChat_Account(administration.proxies.Account chat_account)
	{
		setChat_Account(getContext(), chat_account);
	}

	/**
	 * Set value of Chat_Account
	 * @param context
	 * @param chat_account
	 */
	public final void setChat_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account chat_account)
	{
		if (chat_account == null)
			getMendixObject().setValue(context, MemberNames.Chat_Account.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Chat_Account.toString(), chat_account.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return chatMendixObject;
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
			final chatbot.proxies.Chat that = (chatbot.proxies.Chat) obj;
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
		return "ChatBot.Chat";
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