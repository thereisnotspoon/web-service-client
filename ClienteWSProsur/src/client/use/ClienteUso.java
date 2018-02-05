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
		
		IpRecord ipRecord = new IpRecord();
		IpRecordTypeEnum ipType = IpRecordTypeEnum.DISTINCTIVE_SIGN;
		
		ObjectFactory objectFactory = new ObjectFactory();
		
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

		
		ipRecord.setIpRecordId(objectFactory.createIpRecordIpRecordId((long) 6969));
		ipRecord.setOnapiId(objectFactory.createIpRecordOnapiId("EC"));
		ipRecord.setApplicationId(objectFactory.createIpRecordApplicationId("1706136665486666"));
		ipRecord.setRecordType(objectFactory.createIpRecordRecordType(ipType));
		ipRecord.setNationalPresentationDate(objectFactory.createIpRecordNationalPresentationDate(date2));
		ipRecord.setNationalPublishingDate(objectFactory.createIpRecordNationalPublishingDate(date2));
		ipRecord.setTitle(objectFactory.createIpRecordTitle("titulo de relleno"));
		ipRecord.getApplicantName().add("Jose Maria Chipugsi Catota, Bill Gates Quishpe");
		ipRecord.setStatusId(objectFactory.createIpRecordStatusId("EN_TRAMITE"));
		ipRecord.setIpRecordFilesService(objectFactory.createIpRecordIpRecordFilesService("aqui deberia ir la url del ws del IEPI"));
		
	}
}
