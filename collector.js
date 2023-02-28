function getCssSelector(element) {
    var path = [];
    while (element.parentNode) {
        var tagName = element.tagName.toLowerCase();
        var siblings = element.parentNode.children;
        var nth = 1;
        for (var i = 0; i < siblings.length; i++) {
            if (siblings[i].tagName.toLowerCase() == tagName) {
                if (siblings[i] == el) {
                    path.unshift(tagName + ':nth-child(' + nth + ')');
                    break;
                }
            nth++;
            }
        }
        element = element.parentNode;
    }
    return path.join(' > ');
}

document.addEventListener('click',(event) =>{

    var cssSelector = getCssSelector(event.target);
    var innerText = event.target.innerText;
    var userTime = new Date().toLocaleString();

    console.log(cssSelector);
    console.log(innerText);
    console.log(userTime);
 
});
