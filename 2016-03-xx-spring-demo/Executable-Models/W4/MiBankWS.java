package mibankws;

import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class MiBankWS {
	private static Logger logger = Logger.getLogger(MiBankWS.class.getName());

	@WebMethod
	@WebResult(name = "NewAccountBalance")
	public double applyTransationOnAccount(
			@WebParam(name = "AccountRef") String accountRef,
			@WebParam(name = "TransactionAmount") double transactionAmount,
			@WebParam(name = "AccountBalance") double accountBalance) {
		logger.entering("MiBankWS", "applyTransationOnAccount");
		logger.info("apply transaction of " + transactionAmount);
		double newBalance = accountBalance + transactionAmount;
		logger.exiting("MiBankWS", "applyTransationOnAccount");
		return newBalance;
	}

	public MiBankWS() {
	}

	public static void main(String[] args) {
		String address = "http://localhost:6543/mibankws";
		if (args.length > 1) {
			address = args[0];
		}
		Endpoint endPoint = Endpoint.publish(address, new MiBankWS());
		if (endPoint.isPublished()) {
			System.out.println("endpoint published : " + address);
		}
	}

}
