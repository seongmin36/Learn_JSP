package ch08;

import java.util.*;

public class ProductService {
	Map<String, Product> products = new HashMap<>(); // 필드 초기화는 여기서 바로 맵을 생성

	public ProductService() {
		// 생성자에서 맵에 데이터들을 '채워 넣습니다'.
		Product p = new Product("101", "애플사과폰 12", "애플전자", 1200000, "2020.12.12");
		products.put("101", p);
		p = new Product("102", "삼전우주폰 21", "삼전전자", 1300000, "2021.2.2");
		products.put("102", p);
		p = new Product("103", "엘스듀얼폰", "엘스전자", 1500000, "2021.3.2");
		products.put("103", p);
        // 이 시점에서 products 맵은 3개의 Product 객체로 채워져 있습니다.
	}

	public Product find(String id) {
		return products.get(id);
	}

	// findAll() 메서드가 호출될 때마다 products 맵의 현재 값들을 기반으로 새로운 리스트를 생성하여 반환합니다.
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
}