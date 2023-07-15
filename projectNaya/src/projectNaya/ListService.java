package projectNaya;

public class ListService {
	
	public static CSBag SabasListService(CSBag inbag) throws Exception {
		
		inBag.put("SERVİCE_NAME","SabasListService"); //servis name e rastgele isim verdim
		
		String token = getAccessToken(inbag);
		
		ListemeInput input = new ListemeInput();
		
		if(!CoreUtil.hasBagKeyValue(inbag,"BASLANGIC_TARIHI")) {
			throw new CSException (0,"Başlangıç tarihi verilmelidir!");
		}
		if(!CoreUtil.hasBagKeyValue(inbag,"BITIS_TARIHI")) {
			throw new CSException (0,"Bitiş tarihi verilmelidir!");
		}
		if(!CoreUtil.hasBagKeyValue(inbag,"KULLANICI")) {
			throw new CSException (0,"Kullanıcı verilmelidir!");
		}
		if(CoreUtil.hasBagKeyValue(inbag,"DOSYA_STATUSU")) {
			input.setDosyaStatusu(inbag.get("DOSYA_STATUSU").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"DOSYA_NUMARASI")) {
			input.setDosyaStatusu(inbag.get("DOSYA_NUMARASI").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"OLAY_RISKI")) {
			input.setDosyaStatusu(inbag.get("OLAY_RISKI").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"KIMLIK_NO")) {
			input.setDosyaStatusu(inbag.get("KIMLIK_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"PASAPORT_NO")) {
			input.setDosyaStatusu(inbag.get("PASAPORT_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"VKN")) {
			input.setDosyaStatusu(inbag.get("VKN").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"TELEFON_NUMARASI")) {
			input.setDosyaStatusu(inbag.get("TELEFON_NUMARASI").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"ADRES_IL_KODU")) {
			input.setDosyaStatusu(inbag.get("DADRES_IL_KODU").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"ADRES_ILCE_KODU")) {
			input.setDosyaStatusu(inbag.get("ADRES_ILCE_KODU").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"ADI")) {
			input.setDosyaStatusu(inbag.get("ADI").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"SOYADI")) {
			input.setDosyaStatusu(inbag.get("SOYADI").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"NACE_KODU")) {
			input.setDosyaStatusu(inbag.get("NACE_KODU").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"CEVAP_DURUMU")) {
			input.setDosyaStatusu(inbag.get("CEVAP_DURUMU").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"E_POSTA")) {
			input.setDosyaStatusu(inbag.get("E_POSTA").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"NC_SERI_NO")) {
			input.setDosyaStatusu(inbag.get("NC_SERI_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"TCKK_SERI_NO")) {
			input.setDosyaStatusu(inbag.get("TCKK_SERI_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"EHLIYET_NO")) {
			input.setDosyaStatusu(inbag.get("EHLIYET_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"IMEI_NO")) {
			input.setDosyaStatusu(inbag.get("IMEI_NO").toString());
		}
		if(CoreUtil.hasBagKeyValue(inbag,"IP")) {
			input.setDosyaStatusu(inbag.get("IP").toString());
		}
		
		//ivy.xml içerisine <dependency> eklememiz gerekiyor ..
		Gson gson = GsonFactory.createRiskDeclarationGson();
		
		//Default HTTP kodları gelecek buraya ....
		DefaultHttpClient client=new DefaultHttpClient();
		HttpPost postRequest;
		
		postRequest = new HttpPost("https bağlantısı")
		
		//HTTP post kodları buraya gelecek
		
		postRequest.addHeader("Authorization",token);
		
		ListelemeOutput output=new ListelemeOutput();
		
		String result = "";
		
			StringEntity entity=new StringEntity(gson.toJson(input),"UTF-8");
			
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
			postRequest.setEntity(entity);
			postRequest.setHeader("Accept","application/json");
			postRequest.setHeader("Content-type","application/json");
			
			client=wrapClient(client);
			HttpResponse response=client.execute(postRequest);
			
			result=EntityUtils.toString(response.getEntity(),"utf-8");
			
			output=gson.fromJson(result,ListelemeOutput.class);
		
		
				
		
		
	}
	
}
