//package com.github.felipearomani.myfood.model.services.food;
//
//import com.github.felipearomani.myfood.model.entities.food.MenuItem;
//import com.github.felipearomani.myfood.model.exceptions.EmptyFoodsException;
//import com.github.felipearomani.myfood.model.repositories.food.FoodListRepository;
//import com.github.javafaker.Faker;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.projection.ProjectionFactory;
//import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
//
//import java.util.*;
//import java.util.stream.IntStream;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//import static org.mockito.Mockito.when;
//
//public class MenuOptionListServiceImplTest {
//
//    @Mock
//    private FoodListRepository foodListRepository;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void mustGetListOfFoods() {
//        PageRequest pageRequest = PageRequest.of(0, 10);
//        when(foodListRepository.getPaginatedFoods(pageRequest))
//                .thenReturn(getMockFoodList(10));
//
//        FoodListServiceImpl foodListService = new FoodListServiceImpl(foodListRepository);
//
//        Page<MenuItem> foods = foodListService.get(pageRequest);
//
//        assertThat(foods.getTotalElements(), is(10L));
//    }
//
//    @Test(expected = EmptyFoodsException.class)
//    public void mustThrowEmptyFoodsException() {
//        PageRequest pageRequest = PageRequest.of(0, 10);
//        when(foodListRepository.getPaginatedFoods(pageRequest)).thenReturn(getMockFoodList(0));
//
//        FoodListServiceImpl foodListService = new FoodListServiceImpl(foodListRepository);
//        foodListService.get(pageRequest);
//    }
//
//    private Page<MenuItem> getMockFoodList(int quantity) {
//        return new PageImpl<MenuItem>(generateProjections(quantity));
//    }
//
//    private List<MenuItem> generateProjections(int quantity) {
//
//        if(quantity <= 0) {
//            return Collections.emptyList();
//        }
//
//        List<MenuItem> foods = new ArrayList<>();
//
//        IntStream.range(0, quantity)
//                .forEach(index -> {
//                    final ProjectionFactory projectionFactory = new SpelAwareProxyProjectionFactory();
//                    HashMap<String, Object> values = new HashMap<>();
//
//                    int id = new Random().nextInt(1000);
//                    String foodName = new Faker().lorem().word();
//                    String description = new Faker().lorem().sentence();
//
//                    values.put("id", id);
//                    values.put("name", foodName);
//                    values.put("description", description);
//
//                    MenuItem food = projectionFactory.createProjection(MenuItem.class, values);
//                    foods.add(food);
//                });
//
//        return foods;
//    }
//}