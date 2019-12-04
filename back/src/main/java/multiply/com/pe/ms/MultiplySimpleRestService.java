package multiply.com.pe.ms;

import org.apache.commons.lang3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import multiply.com.pe.dto.MultiplyDto;
import multiply.com.pe.dto.Response;
import multiply.com.pe.service.MultiplyService;

@RestController
public class MultiplySimpleRestService {
	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	MultiplyService multiplyService;

	@GetMapping("/multiply/{one}/{two}")
	public Response multiply(@PathVariable(value = "one") String one, @PathVariable(value = "two") String two) {
		if (StringUtils.isNumeric(one) && StringUtils.isNumeric(two)) {
			MultiplyDto out = multiplyService.save(new MultiplyDto(Double.valueOf(one), Double.valueOf(two)));
			if (out == null) {
				return new Response(0, "Error Data");
			} else {
				return new Response(out.getResult(), "Calculated");
			}
		} else {
			return new Response(0, "Error DataType");
		}

	}
}
