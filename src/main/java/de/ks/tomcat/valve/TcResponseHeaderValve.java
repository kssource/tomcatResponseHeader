package de.ks.tomcat.valve;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

public class TcResponseHeaderValve extends ValveBase {
	
	private Map<String, String> headersMap = new HashMap<String, String>(10);

	//configuration attributes
	private String headerName_1;
	private String headerValue_1;
	private String headerName_2;
	private String headerValue_2;
	private String headerName_3;
	private String headerValue_3;
	private String headerName_4;
	private String headerValue_4;
	private String headerName_5;
	private String headerValue_5;
	private String headerName_6;
	private String headerValue_6;
	private String headerName_7;
	private String headerValue_7;
	private String headerName_8;
	private String headerValue_8;
	private String headerName_9;
	private String headerValue_9;
	private String headerName_10;
	private String headerValue_10;
	
	public void invoke(Request request, Response response) throws IOException, ServletException {
		for (Map.Entry<String, String> entry : headersMap.entrySet()) {
			response.setHeader(entry.getKey(), entry.getValue());
		}
		
        getNext().invoke(request, response);
	}

	public void setHeaderName_1(String headerName_1) {
		this.headerName_1 = headerName_1;
		if(headerName_1 != null && headerValue_1 != null) {
			headersMap.put(headerName_1, headerValue_1);
		}
	}

	public void setHeaderValue_1(String headerValue_1) {
		this.headerValue_1 = headerValue_1;
		if(headerName_1 != null && headerValue_1 != null) {
			headersMap.put(headerName_1, headerValue_1);
		}
	}

	public void setHeaderName_2(String headerName_2) {
		this.headerName_2 = headerName_2;
		if(headerName_2 != null && headerValue_2 != null) {
			headersMap.put(headerName_2, headerValue_2);
		}
	}

	public void setHeaderValue_2(String headerValue_2) {
		this.headerValue_2 = headerValue_2;
		if(headerName_2 != null && headerValue_2 != null) {
			headersMap.put(headerName_2, headerValue_2);
		}
	}

	public void setHeaderName_3(String headerName_3) {
		this.headerName_3 = headerName_3;
		if(headerName_3 != null && headerValue_3 != null) {
			headersMap.put(headerName_3, headerValue_3);
		}
	}

	public void setHeaderValue_3(String headerValue_3) {
		this.headerValue_3 = headerValue_3;
		if(headerName_3 != null && headerValue_3 != null) {
			headersMap.put(headerName_3, headerValue_3);
		}
	}

	public void setHeaderName_4(String headerName_4) {
		this.headerName_4 = headerName_4;
		if(headerName_4 != null && headerValue_4 != null) {
			headersMap.put(headerName_4, headerValue_4);
		}
	}

	public void setHeaderValue_4(String headerValue_4) {
		this.headerValue_4 = headerValue_4;
		if(headerName_4 != null && headerValue_4 != null) {
			headersMap.put(headerName_4, headerValue_4);
		}
	}

	public void setHeaderName_5(String headerName_5) {
		this.headerName_5 = headerName_5;
		if(headerName_5 != null && headerValue_5 != null) {
			headersMap.put(headerName_5, headerValue_5);
		}
	}

	public void setHeaderValue_5(String headerValue_5) {
		this.headerValue_5 = headerValue_5;
		if(headerName_5 != null && headerValue_5 != null) {
			headersMap.put(headerName_5, headerValue_5);
		}
	}

	public void setHeaderName_6(String headerName_6) {
		this.headerName_6 = headerName_6;
		if(headerName_6 != null && headerValue_6 != null) {
			headersMap.put(headerName_6, headerValue_6);
		}
	}

	public void setHeaderValue_6(String headerValue_6) {
		this.headerValue_6 = headerValue_6;
		if(headerName_6 != null && headerValue_6 != null) {
			headersMap.put(headerName_6, headerValue_6);
		}
	}

	public void setHeaderName_7(String headerName_7) {
		this.headerName_7 = headerName_7;
		if(headerName_7 != null && headerValue_7 != null) {
			headersMap.put(headerName_7, headerValue_7);
		}
	}

	public void setHeaderValue_7(String headerValue_7) {
		this.headerValue_7 = headerValue_7;
		if(headerName_7 != null && headerValue_7 != null) {
			headersMap.put(headerName_7, headerValue_7);
		}
	}

	public void setHeaderName_8(String headerName_8) {
		this.headerName_8 = headerName_8;
		if(headerName_8 != null && headerValue_8 != null) {
			headersMap.put(headerName_8, headerValue_8);
		}
	}

	public void setHeaderValue_8(String headerValue_8) {
		this.headerValue_8 = headerValue_8;
		if(headerName_8 != null && headerValue_8 != null) {
			headersMap.put(headerName_8, headerValue_8);
		}
	}

	public void setHeaderName_9(String headerName_9) {
		this.headerName_9 = headerName_9;
		if(headerName_9 != null && headerValue_9 != null) {
			headersMap.put(headerName_9, headerValue_9);
		}
	}

	public void setHeaderValue_9(String headerValue_9) {
		this.headerValue_9 = headerValue_9;
		if(headerName_9 != null && headerValue_9 != null) {
			headersMap.put(headerName_9, headerValue_9);
		}
	}

	public void setHeaderName_10(String headerName_10) {
		this.headerName_10 = headerName_10;
		if(headerName_10 != null && headerValue_10 != null) {
			headersMap.put(headerName_10, headerValue_10);
		}
	}

	public void setHeaderValue_10(String headerValue_10) {
		this.headerValue_10 = headerValue_10;
		if(headerName_10 != null && headerValue_10 != null) {
			headersMap.put(headerName_10, headerValue_10);
		}
	}    
	
	
	
}
