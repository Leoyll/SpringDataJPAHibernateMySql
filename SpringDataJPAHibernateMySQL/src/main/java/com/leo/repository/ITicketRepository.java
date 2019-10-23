package com.leo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.leo.entity.Ticket;

/**
 * CrudRepository<Ticket, Long>: relative service should be Long as well.
 * There are 3 repository interfaces that you should know when you use Spring Data JPA:
 * CrudRepository
 * PagingAndSortingRepository
 * JpaRepository
 * CrudRepository interface defines a repository that offers standard create, read, update and delete operations. 
 * PagingAndSortingRepository extends the CrudRepository and adds findAll methods that enable you to sort the result and to retrieve it in a paginated way. 
 * Both interface are also supported by other Spring Data projects, so that you can apply the same concepts to different data stores. 
 * JpaRepository adds JPA-specific methods, like flush() to trigger a flush on the persistence context or findAll(Example<S> example) to find entities by example, to the PagingAndSortingRepository.
 * 
 * @author Leo
 *
 */
@Repository
public interface ITicketRepository extends CrudRepository<Ticket, Long>{
	/**
	 * JPQL query
	 * @param nameLike1
	 * @return
	 */
	@Query("FROM #{#entityName} c where c.ticket_activity_name like %?1%")
	List<Ticket> findNameLike1(String nameLike1);
	
	/*
	 * JPQL query
	 * findNameLike2,3,4,5 are same functions.
	 * More knowledge on JPQL: https://thoughts-on-java.org/jpql/
	 */
	@Query("FROM #{#entityName} c where c.ticket_activity_name =:nameLike2")
	List<Ticket> findNameLike2(@Param("nameLike2") String nameLike2);
	@Query("SELECT c FROM #{#entityName} c where c.ticket_activity_name = ?1")
	List<Ticket> findNameLike3(String nameLike3);
	@Query(value="SELECT * FROM my_ticket where ticket_name = ?", nativeQuery = true)
	List<Ticket> findNameLike4(String nameLike4);
	@Query(value="SELECT * FROM my_ticket where ticket_name = :nameLike5", nativeQuery = true)
	List<Ticket> findNameLike5(@Param("nameLike5") String nameLike5);	

}
