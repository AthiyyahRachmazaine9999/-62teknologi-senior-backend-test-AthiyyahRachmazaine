package service;

import entity.Item;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ItemRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ItemServiceImpl implements ItemService{


    @Autowired
    private ItemRepository itemsRepository;


    @Override
    public Item saveItem(Item items) {
        return itemsRepository.save(items);
    }

    @Override
    public List<Item> fetchAllItem() {
        List<Item> allItem = itemsRepository.findAll();
        return allItem;
    }

    @Override
    public Item getId(VarcharJdbcType id) {
        Optional<Item> items = itemsRepository.findById(id);
        if (items.isPresent()) {
            return items.get();
        }
        return null;
    }

    @Override
    public Item updateId(VarcharJdbcType id, Item items) {
        Optional<Item> items1 = itemsRepository.findById(id);

        if (items1.isPresent()) {
            Item originalItem = items1.get();

            if (Objects.nonNull(items.getAlias()) ) {
                originalItem.setAlias(items.getAlias());
            }
            if (Objects.nonNull(items.getName()) ) {
                originalItem.setName(items.getName());
            }
            if (Objects.nonNull(items.getImage_url()) ) {
                originalItem.setImage_url(items.getImage_url());
            }
            if (Objects.nonNull(items.getIs_closed()) ) {
                originalItem.setIs_closed(items.getIs_closed());
            }
            if (Objects.nonNull(items.getUrl()) ) {
                originalItem.setUrl(items.getUrl());
            }
            if (Objects.nonNull(items.getReview_count()) ) {
                originalItem.setReview_count(items.getReview_count());
            }
            if (Objects.nonNull(items.getCategories0alias()) ) {
                originalItem.setCategories0alias(items.getCategories0alias());
            }
            if (Objects.nonNull(items.getCategories0title()) ) {
                originalItem.setCategories0title(items.getCategories0title());
            }
            if (Objects.nonNull(items.getCategories1alias()) ) {
                originalItem.setCategories1alias(items.getCategories1alias());
            }
            if (Objects.nonNull(items.getCategories1title()) ) {
                originalItem.setCategories1title(items.getCategories1title());
            }
            if (Objects.nonNull(items.getCategories2alias()) ) {
                originalItem.setCategories2alias(items.getCategories2alias());
            }
            if (Objects.nonNull(items.getCategories2title()) ) {
                originalItem.setCategories2title(items.getCategories2title());
            }
            if (Objects.nonNull(items.getRating()) ) {
                originalItem.setRating(items.getRating());
            }
            if (Objects.nonNull(items.getCoordinateslatitude()) ) {
                originalItem.setCoordinateslatitude(items.getCoordinateslatitude());
            }
            if (Objects.nonNull(items.getCoordinateslongitude()) ) {
                originalItem.setCoordinateslongitude(items.getCoordinateslongitude());
            }
            if (Objects.nonNull(items.getTransactions0()) ) {
                originalItem.setTransactions0(items.getTransactions0());
            }
            if (Objects.nonNull(items.getPrice()) ) {
                originalItem.setPrice(items.getPrice());
            }
            if (Objects.nonNull(items.getLocationaddress1()) ) {
                originalItem.setLocationaddress1(items.getLocationaddress1());
            }
            if (Objects.nonNull(items.getLocationaddress2()) ) {
                originalItem.setLocationaddress2(items.getLocationaddress2());
            }
            if (Objects.nonNull(items.getLocationaddress3()) ) {
                originalItem.setLocationaddress3(items.getLocationaddress3());
            }
            if (Objects.nonNull(items.getLocationcity()) ) {
                originalItem.setLocationcity(items.getLocationcity());
            }
            if (Objects.nonNull(items.getLocationzip_code()) ) {
                originalItem.setLocationzip_code(items.getLocationzip_code());
            }
            if (Objects.nonNull(items.getLocationdisplay_address0()) ) {
                originalItem.setLocationdisplay_address0(items.getLocationdisplay_address0());
            }
            if (Objects.nonNull(items.getLocationdisplay_address1()) ) {
                originalItem.setLocationdisplay_address1(items.getLocationdisplay_address1());
            }
            if (Objects.nonNull(items.getLocationdisplay_address2()) ) {
                originalItem.setLocationdisplay_address2(items.getLocationdisplay_address2());
            }
            if (Objects.nonNull(items.getPhone()) ) {
                originalItem.setPhone(items.getPhone());
            }
            if (Objects.nonNull(items.getDisplay_phone()) ) {
                originalItem.setDisplay_phone(items.getDisplay_phone());
            }
            if (Objects.nonNull(items.getDistance()) ) {
                originalItem.setDistance(items.getDistance());
            }
            if (Objects.nonNull(items.getTransactions1()) ) {
                originalItem.setTransactions1(items.getTransactions1());
            }
            if (Objects.nonNull(items.getTransactions2()) ) {
                originalItem.setTransactions2(items.getTransactions2());
            }


            return itemsRepository.save(originalItem);
        }
        return null;
    }

    @Override
    public String deleteId(VarcharJdbcType id) {
        if (itemsRepository.findById(id).isPresent()) {
            itemsRepository.deleteById(id);
            return "Item deleted successfully";
        }
        return "No such item in the database";
    }
}
