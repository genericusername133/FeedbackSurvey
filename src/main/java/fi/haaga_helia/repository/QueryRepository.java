package fi.haaga_helia.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fi.haaga_helia.entity.Query;

	public interface QueryRepository extends CrudRepository<Query, Long>{
		List<Query> findByQueryId(int queryId);
	}
