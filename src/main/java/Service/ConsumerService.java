package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Consumer;
import Repository.ConsumerRepository;

import java.util.List;

@Service
public class ConsumerService {
	@Autowired
	private ConsumerRepository repository;

	public Consumer saveConsumer(Consumer consumer) {
		return repository.save(consumer);
	}

	public List<Consumer> saveConsumers(List<Consumer> consumers) {
		return repository.saveAll(consumers);
	}

	public List<Consumer> getConsumers() {
		return repository.findAll();
	}

	public Consumer getConsumerById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Consumer getConsumerByName(String name) {
		return repository.findByName(name);
	}

	public String deleteConsumer(int id) {
		repository.deleteById(id);
		return "Consumer removed !! " + id;
	}

	public Consumer updateConsumer(Consumer consumer) {
		Consumer existingConsumer = repository.findById(consumer.getId()).orElse(null);
		existingConsumer.setName(consumer.getName());
		return repository.save(existingConsumer);
	}

}
