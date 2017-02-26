package net.ess3.api;

import static com.earth2me.essentials.I18n.tl;


@SuppressWarnings("serial")
public class NoLoanPermittedException extends Exception
{
	public NoLoanPermittedException()
	{
		super(tl("negativeBalanceError"));
	}
}
