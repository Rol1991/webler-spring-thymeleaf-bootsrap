package hu.webler.weblerspringthymeleafbootsrap.view.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paged<T> {

    private List<T> contents;
    private int pageNumber;
    private int totalPage;
}
