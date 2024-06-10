package com.ey.day9assignment;

import java.util.List;
import java.util.Set;

public interface AuthorService {
	
	public Set<String> getUniqueSurnames(List<Author> authorList);
	public List<Author> getAuthorsByCity(List<Author> authorList,String city);
	public double femaleAverageAge(List<Author> authorList);
	public Long getMobileByAdhar(List<Author> authorList,Long adharCard);
}
