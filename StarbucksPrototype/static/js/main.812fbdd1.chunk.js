(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{18:function(e,a,t){},30:function(e,a,t){"use strict";t.r(a);var c=t(0),l=t.n(c),r=t(8),s=t.n(r);t(18);var i=()=>l.a.createElement("header",{className:"header",id:"header"},l.a.createElement("nav",{className:"nav container"},l.a.createElement("a",{href:"#home",className:"nav__logo"}),l.a.createElement("div",{className:"nav__menu",id:"nav-menu"},l.a.createElement("ul",{className:"nav__list"},l.a.createElement("li",{className:"nav__item"},l.a.createElement("a",{href:"#home",className:"nav__link active-link"},"Home")),l.a.createElement("li",{className:"nav__item"},l.a.createElement("a",{href:"#products",className:"nav__link"},"Products")),l.a.createElement("li",{className:"nav__item"},l.a.createElement("a",{href:"#place",className:"nav__link"},"Place")),l.a.createElement("li",{className:"nav__item"},l.a.createElement("a",{href:"#blog",className:"nav__link"},"Blog"))),l.a.createElement("div",{className:"nav__close",id:"nav-close"},l.a.createElement("i",{className:"bx bx-x"}))),l.a.createElement("div",{className:"nav__toggle",id:"nav-toggle"},l.a.createElement("i",{className:"bx bx-grid-alt"})))),n=t(4);var m=()=>{return l.a.createElement("section",{class:"hero section",id:"home"},l.a.createElement(n.Fade,{top:!0},l.a.createElement("h1",{className:"hero__title"},l.a.createElement("span",{className:"hero__title--green"},"Star"),l.a.createElement("span",{className:"hero__title--grey"},"bucks")),l.a.createElement("p",null," Opulent coffee beans, brimming with a wealth  of flavor  "),l.a.createElement("button",{className:"hero__button",onClick:()=>{window.scrollTo({top:1150,behavior:"smooth"})}},"Order Now")))};var o=()=>l.a.createElement("div",{className:"special section container",id:"special"},l.a.createElement("div",{className:"special__container"},l.a.createElement("div",{className:"special__box"},l.a.createElement(n.Fade,{left:!0,delay:500},l.a.createElement("h2",{className:"section__title"},"Discover luxury in each cup   ",l.a.createElement("br",null),"Inspire delight and sophistication"))),l.a.createElement("div",{className:"special__category"},l.a.createElement(n.Fade,{bottom:!0,delay:800},l.a.createElement("div",{className:"special__group"},l.a.createElement("div",{className:"special__img__border"},l.a.createElement("img",{src:"./media/coffee-beans.png",alt:"",className:"special__img"})),l.a.createElement("h3",{className:"special__title"},"Original Coffee"),l.a.createElement("p",{className:"special__description"},"Selecting the Finest Coffee Beans for an Authentic Flavor")),l.a.createElement("div",{className:"special__group"},l.a.createElement("div",{className:"special__img__border"},l.a.createElement("img",{src:"./media/hot-drink.png",alt:"",className:"special__img"})),l.a.createElement("h3",{className:"special__title"},"Hot Coffee"),l.a.createElement("p",{className:"special__description"},"Savor the authentic taste of your coffee served hot.")),l.a.createElement("div",{className:"special__group"},l.a.createElement("div",{className:"special__img__border"},l.a.createElement("img",{src:"./media/coffee-cup.png",alt:"",className:"special__img"})),l.a.createElement("h3",{className:"special__title"},"Iced Coffee"),l.a.createElement("p",{className:"special__description"},"Enjoy your coffee with a refreshing breeze of taste.")))))),_=t(5);var d=()=>{const[e,a]=Object(c.useState)("main-menu");return l.a.createElement("section",{className:"products section",id:"products"},l.a.createElement("div",{className:"products__container container"},l.a.createElement(n.Fade,{left:!0,delay:400},l.a.createElement("h2",{className:"section__title"},"Find delicious food and ",l.a.createElement("br",null),"choose what you love")),l.a.createElement("ul",{className:"products__filters"},l.a.createElement(n.Fade,{left:!0,delay:600},l.a.createElement("li",{className:"products__item products__line ".concat("main-menu"===e&&"active-product"),onClick:()=>a("main-menu"),"data-filter":".delicacies"},l.a.createElement("h3",{className:"products__title"},"Main Menu"),l.a.createElement("span",{className:"products__stock"},"3 products")),l.a.createElement("li",{className:"products__item products__line ".concat("coffee"===e&&"active-product"),onClick:()=>a("coffee"),"data-filter":".coffee"},l.a.createElement("h3",{className:"products__title"},"Coffee"),l.a.createElement("span",{className:"products__stock"},"5 products")),l.a.createElement("li",{className:"products__item products__line ".concat("desserts"===e&&"active-product"),onClick:()=>a("desserts"),"data-filter":".cake"},l.a.createElement("h3",{className:"products__title"},"Desserts"),l.a.createElement("span",{className:"products__stock"},"4 products")))),l.a.createElement("div",{className:"products__content grid"},_.categories.map((a,t)=>a.category===e&&l.a.createElement(n.Fade,{key:t,bottom:!0,delay:100*t},l.a.createElement("article",{className:"products__card main-menu"},l.a.createElement("div",{className:"products__shape"},l.a.createElement("img",{src:a.imageUrl,alt:"",className:"products__img"})),l.a.createElement("div",{className:"products__data"},l.a.createElement("h2",{className:"products__price"},"$",a.price),l.a.createElement("h3",{className:"products__name"},a.title),l.a.createElement("button",{className:"button products__button"},l.a.createElement("i",{className:"bx bx-shopping-bag"})))))))))};var p=()=>{const[e,a]=Object(c.useState)(_.places[0].imageUrl);return l.a.createElement("section",{className:"place section",id:"place"},l.a.createElement("div",{className:"place__container container"},l.a.createElement("h2",{className:"section__title"},"Make you feel good with ",l.a.createElement("br",null),"our fascinating facilities"),l.a.createElement("div",{className:"place__content grid"},l.a.createElement("div",{className:"place__images"},l.a.createElement("img",{src:e,alt:"",className:"place__img-big"}),l.a.createElement("div",{className:"place__img-smalls"},_.places.map((t,c)=>l.a.createElement("img",{key:c,src:t.imageUrl,onClick:()=>a(t.imageUrl),alt:"",className:"place__img-small  ".concat(e===t.imageUrl&&"active")})))),l.a.createElement("div",{className:"place__data"},l.a.createElement("h2",{className:"place__title"},"Find a place you love"),l.a.createElement("p",{className:"place__description"},"We provide a workspace that promotes productivity and creativity ",l.a.createElement("br",null),"by blending a positive atmosphere with visually appealing aesthetics.")))))};var E=()=>l.a.createElement("section",{class:"blog section",id:"blog"},l.a.createElement("div",{class:"blog__container container"},l.a.createElement("h2",{class:"section__title"},"Our blogs coffee with ",l.a.createElement("br",null),"insightful topic"),l.a.createElement("div",{class:"blog__content grid"},l.a.createElement("article",{class:"blog__card"},l.a.createElement("div",{class:"blog__image"},l.a.createElement("img",{src:"./media/beans.jpeg",alt:"",class:"blog__img"}),l.a.createElement("a",{href:"#",class:"blog__button"},l.a.createElement("i",{class:"bx bx-right-arrow-alt"})),l.a.createElement("div",{class:"blog__stats"},l.a.createElement("div",{class:"blog__reaction"},l.a.createElement("i",{class:"bx bx-comment"}),l.a.createElement("span",null,"12")),l.a.createElement("div",{class:"blog__reaction"},l.a.createElement("i",{class:"bx bx-show"}),l.a.createElement("span",null,"76,5k")))),l.a.createElement("div",{class:"blog__data"},l.a.createElement("h2",{class:"blog__title"},"Where Starbucks Coffee is harvested"),l.a.createElement("p",{class:"blog__description"},"Find out where the rich Starbucks Coffee are harvested from, and where the journey of your coffee begins."))),l.a.createElement("article",{class:"blog__card"},l.a.createElement("div",{class:"blog__image"},l.a.createElement("img",{src:"./media/barist.jpeg",alt:"",class:"blog__img"}),l.a.createElement("a",{href:"#",class:"blog__button"},l.a.createElement("i",{class:"bx bx-right-arrow-alt"})),l.a.createElement("div",{class:"blog__stats"},l.a.createElement("div",{class:"blog__reaction"},l.a.createElement("i",{class:"bx bx-comment"}),l.a.createElement("span",null,"96")),l.a.createElement("div",{class:"blog__reaction"},l.a.createElement("i",{class:"bx bx-show"}),l.a.createElement("span",null,"356,7k")))),l.a.createElement("div",{class:"blog__data"},l.a.createElement("h2",{class:"blog__title"},"Life at Starbucks"),l.a.createElement("p",{class:"blog__description"},"Find out what it's like to have a career at Starbucks, from the barista, to the cashier!"))))));var g=()=>l.a.createElement("footer",{className:"footer"},l.a.createElement("div",{className:"footer__container container"},l.a.createElement("h1",{className:"footer__title"},"Starbucks",l.a.createElement("span",null,"."),"co"),l.a.createElement("p",{className:"footer__description"},"The best place to work ",l.a.createElement("br",null),"and be more productive."),l.a.createElement("div",{className:"footer__content grid"},l.a.createElement("div",{className:"footer__data"},l.a.createElement("h2",{className:"footer__subtitle"},"Address"),l.a.createElement("p",{className:"footer__information"},"340 Woodland Ave  ",l.a.createElement("br",null),"Paris 003")),l.a.createElement("div",{className:"footer__data"},l.a.createElement("h2",{className:"footer__subtitle"},"Contact"),l.a.createElement("p",{className:"footer__information"},"+9341029812 ",l.a.createElement("br",null),"stbucks@email.com")),l.a.createElement("div",{className:"footer__data"},l.a.createElement("h2",{className:"footer__subtitle"},"Office"),l.a.createElement("p",{className:"footer__information"},"Monday - Saturday ",l.a.createElement("br",null),"9AM - 10PM")),l.a.createElement("div",{className:"footer__data"},l.a.createElement("p",{className:"footer__newsletter-description"},"Subscribe to our newsletter"),l.a.createElement("div",{className:"footer__newsletter"},l.a.createElement("input",{type:"email",placeholder:"Your email address",className:"footer__input"}),l.a.createElement("button",{className:"footer__button"},l.a.createElement("i",{className:"bx bx-right-arrow-alt"}))))),l.a.createElement("div",{className:"footer__group"},l.a.createElement("ul",{className:"footer__social"},l.a.createElement("a",{href:"#instagram",target:"_blank",className:"footer__social-link"},l.a.createElement("i",{className:"bx bxl-facebook"})),l.a.createElement("a",{href:"#facebook",target:"_blank",className:"footer__social-link"},l.a.createElement("i",{className:"bx bxl-instagram"})),l.a.createElement("a",{href:"#tiktok",target:"_blank",className:"footer__social-link"},l.a.createElement("i",{className:"bx bxl-tiktok"}))),l.a.createElement("span",{className:"footer__copy"}," \xa9 Sherap, All rights reserved "))));var u=function(){return l.a.createElement(l.a.Fragment,null,l.a.createElement(i,null),l.a.createElement("main",{className:"main"},l.a.createElement(m,null),l.a.createElement(o,null),l.a.createElement(d,null),l.a.createElement(p,null),l.a.createElement(E,null)),l.a.createElement(g,null))};s.a.createRoot(document.getElementById("root")).render(l.a.createElement(l.a.StrictMode,null,l.a.createElement(u,null)))},5:function(e){e.exports={categories:[{_id:"abc123",category:"main-menu",title:"Club Sandwhich",price:"8",imageUrl:"./media/sandwhich.jpeg"},{_id:"abc123",category:"main-menu",title:"Avocado Bagel",price:"6",imageUrl:"./media/avocadotoast.jpeg"},{_id:"abc123",category:"main-menu",title:"Chicken Wrap",price:"10",imageUrl:"./media/wrap.jpeg"},{_id:"abc123",category:"coffee",title:"Hot Latte",price:"5",imageUrl:"./media/Latte.jpeg"},{_id:"abc123",category:"coffee",title:"Strawberry Acai",price:"5",imageUrl:"./media/pink.jpeg"},{_id:"abc123",category:"coffee",title:"Coldbrew",price:"4",imageUrl:"./media/coldbrew1.jpeg"},{_id:"abc123",category:"coffee",title:"Frappucino",price:"7",imageUrl:"./media/Frap.jpeg"},{_id:"abc123",category:"coffee",title:"Iced Matcha",price:"7",imageUrl:"./media/Matcha.png"},{_id:"abc123",category:"desserts",title:"Choclate Brownie",price:"9",imageUrl:"./media/brownie.jpeg"},{_id:"abc123",category:"desserts",title:"Strawberry Ringpop",price:"3",imageUrl:"./media/ringpop.jpeg"},{_id:"abc123",category:"desserts",title:"Pumpkin spice Ringpop",price:"3",imageUrl:"./media/ringpop2.jpeg"},{_id:"abc123",category:"desserts",title:"Chocolate Chip Cookies",price:"10",imageUrl:"./media/cookies.jpeg"}],places:[{_id:"abc123",imageUrl:"./media/work2.jpeg"},{_id:"abc123",imageUrl:"./media/work1.jpg"},{_id:"abc123",imageUrl:"./media/work3.jpeg"}]}},9:function(e,a,t){e.exports=t(30)}},[[9,1,2]]]);
//# sourceMappingURL=main.812fbdd1.chunk.js.map