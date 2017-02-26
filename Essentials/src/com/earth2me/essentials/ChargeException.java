package com.earth2me.essentials;


@SuppressWarnings("serial")
public class ChargeException extends Exception
{
	public ChargeException(final String message)
	{
		super(message);
	}

	public ChargeException(final String message, final Throwable throwable)
	{
		super(message, throwable);
	}
}
