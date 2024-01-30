package hu.webler.weblerspringthymeleafbootsrap.view.model;

import hu.webler.weblerspringthymeleafbootsrap.view.value.PageItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageItem {

    private PageItemType pageItemType;

    private int index;

    private boolean isActive;
}
