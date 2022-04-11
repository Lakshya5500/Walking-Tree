package com.Walkingtree.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

import com.Walkingtree.Entity.Users;
@Service
public interface UsersRepo extends JpaRepository<Users, Integer> {
	


}
