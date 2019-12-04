package multiply.com.pe.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import multiply.com.pe.dto.MultiplyDto;
import multiply.com.pe.entity.Multiply;
import multiply.com.pe.repository.MultiplyRepo;

@Service
public class MultiplyServiceImpl implements MultiplyService {

	@Autowired
	private MultiplyRepo multiplyRepo;

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public MultiplyDto save(MultiplyDto dto) {

		Multiply bean = multiplyRepo.save(modelMapper.map(dto, Multiply.class));
		MultiplyDto dtoOut = modelMapper.map(bean, MultiplyDto.class);
		return dtoOut;

	}

}
