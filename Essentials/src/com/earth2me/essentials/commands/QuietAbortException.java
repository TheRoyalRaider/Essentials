package com.earth2me.essentials.commands;


@SuppressWarnings("serial")
public class QuietAbortException extends Exception
{
	public QuietAbortException()
	{
		super();
	}

	public QuietAbortException(String message)
	{
		super(message);
	}
}
