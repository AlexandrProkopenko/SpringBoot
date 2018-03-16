function getContacts() {

    var request = new XMLHttpRequest();
    request.open('GET', 'http://localhost:8080/get_contacts');
    request.send();

    request.onreadystatechange = function () {
        if (request.readyState == 4 & request.status == 200){
            var contacts = JSON.parse(request.responseText);
            var tblContacts = document.getElementById("contacts");

            for (var i = 0; i < contacts.length; i++){
                var row         = tblContacts.insertRow();
                var cellId      = row.insertCell(0);
                var cellName    = row.insertCell(1);
                var cellSurname = row.insertCell(2);
                var cellEmail   = row.insertCell(3);
                var cellPhone   = row.insertCell(4);

                cellId.innerHTML        = contacts[i].id;
                cellName.innerHTML      = contacts[i].name;
                cellSurname.innerHTML   = contacts[i].surname;
                cellEmail.innerHTML     = contacts[i].email;
                cellPhone.innerHTML     = contacts[i].phone;
            }
        }
    }

}

function createContact(event) {
    // jQuery
    $.ajax({
        type: 'POST',
        url: '/new_contact',
        data: {
            name: $('#name').val(),
            surname: $('#surname').val(),
            email: $('#email').val(),
            phone: $('#phone').val()
        },
        success: function(){
            event.preventDefault();
        },
        error: function (errorThrown) {
            console.log(errorThrown);
        }

    });
}

function getContactsJQuery() {
    jQuery.ajax({
        type: 'GET',
        url: '/get_contacts',
        success: function (response) {

        },
        error: function (errorThrown) {
            console.log(errorThrown);
        }
        })

}

function process(response) {


            var contacts = JSON.parse(response);
            var tblContacts = document.getElementById("contacts");

            for (var i = 0; i < contacts.length; i++){
                var row         = tblContacts.insertRow();

                row.insertCell(0).innerHTML        = contacts[i].id;
                row.insertCell(1).innerHTML     = contacts[i].name;
                crow.insertCell(2).innerHTML    = contacts[i].surname;
                row.insertCell(3).innerHTML      = contacts[i].email;
                row.insertCell(4).innerHTML     = contacts[i].phone;
            }

}