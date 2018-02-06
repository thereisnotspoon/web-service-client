package client.use;

import java.io.ObjectStreamConstants;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.prosur.catalog.ws.*;

public class ClienteUso {
	public static void main(String[] args) {
		
		ProsurIPRecordWSService service = new ProsurIPRecordWSService();
		ProsurIPRecordWS port = service.getProsurIPRecordWSPort();
		
		IpRecordTypeEnum ipType = IpRecordTypeEnum.DISTINCTIVE_SIGN;
		
		ObjectFactory objectFactory = new ObjectFactory();
		
		//manejo de fechas
		Date nationalDate = new Date();
		nationalDate.getTime();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(nationalDate);
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
		DistinctiveSign distinctiveSign = new DistinctiveSign();
		NiceClass nice1 = new NiceClass();
		nice1.setActivity("dummy activity for nice1");
		nice1.setNiceClass(1);
		
		distinctiveSign.setIpRecordId(objectFactory.createIpRecordIpRecordId((long) 6969));
		distinctiveSign.setOnapiId(objectFactory.createIpRecordOnapiId("EC"));
		distinctiveSign.setApplicationId(objectFactory.createIpRecordApplicationId("1706136665486666"));
		distinctiveSign.setRecordType(objectFactory.createIpRecordRecordType(ipType));
		distinctiveSign.setNationalPresentationDate(objectFactory.createIpRecordNationalPresentationDate(date2));
		distinctiveSign.setNationalPublishingDate(objectFactory.createIpRecordNationalPublishingDate(date2));
		distinctiveSign.setTitle(objectFactory.createIpRecordTitle("titulo de relleno"));
		distinctiveSign.getApplicantName().add("Jose Maria Chipugsi Catota, Bill Gates Quishpe");
		distinctiveSign.setStatusId(objectFactory.createIpRecordStatusId("EN_TRAMITE"));
		distinctiveSign.setIpRecordFilesService(objectFactory.createIpRecordIpRecordFilesService("aqui deberia ir la url del ws del IEPI"));
		distinctiveSign.setDistinctiveSignType(objectFactory.createDistinctiveSignDistinctiveSignType("MARCA"));
		distinctiveSign.setExpiration(objectFactory.createDistinctiveSignExpiration(date2));
		distinctiveSign.setLogoDescription(objectFactory.createDistinctiveSignLogoDescription("lorem ipsum consequat"));
		distinctiveSign.getNiceClasses().add(nice1);
		distinctiveSign.setRegistrationDate(objectFactory.createDistinctiveSignRegistrationDate(date2));
		
		String user = "ecu_user";
		System.out.println("hola");

		try {
			port.createRecord(distinctiveSign, user);
		} catch (CatalogFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
