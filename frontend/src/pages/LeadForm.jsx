import { useState } from "react";

export default function LeadForm()
{
    const[ form, setForm ] = useState(
    {
        name: "",
        email: "",
        phone: "",
        projectType: "",
        message: "",
    });

    const [status, setStatus ] = useState( "" );


    const handleChange = ( e ) =>
    {
        setForm(
        {
            ...form,
            [ e.target.name ]: e.target.value,
        });
    };

    const handleSubmit = async ( e ) =>
    {
        e.preventDefault();

        if(
            !form.name.trim() ||
            !form.email.trim() ||
            !form.phone.trim() ||
            !form.projectType.trim() ||
            !form.message.trim()
        ) {
            setStatus( "missing" );
            return;
        }

        // if( !form.email.includes( "@" ) )
        // {
            // setStatus( "invalidEmail" );
            // return;
        // }

        try
        {
            const response = await fetch( "http://localhost:8080/api/leads",
                {
                    method: "POST",
                    headers:
                    {
                        "Content-Type": "application/json",
                    },

                    body: JSON.stringify( form ),
                } );


                if( response.status === 400 )
                {
                    setStatus( "invalidEmail" );
                    return;
                }
                if( !response.ok )
                {
                    setStatus( "error" );
                    return;
                }


                const data = await response.json();

                console.log( "Saved", data );

                setStatus( "success" );

                setForm(
                    {
                        name: "",
                        email: "",
                        phone: "",
                        projectType: "",
                        message: "",
                    } );
        }
        catch ( error )
        {
            console.error( "Error", error );
            setStatus( "error" );
        }
    };


    return(
        <div style={{ padding: "20px" }}>
            <h2>Submit a lead</h2>

            <form onSubmit={handleSubmit}>
                <input
                name="name"
                placeholder="Name"
                value={form.name}
                onChange={handleChange}
                /><br />

                <input name="email"
                placeholder="Email"
                value={form.email}
                onChange={handleChange}
                /><br />

                <input name="phone"
                placeholder="Phone"
                value={form.phone}
                onChange={handleChange}
                /><br />

                <input name="projectType"
                placeholder="Project Type"
                value={form.projectType}
                onChange={handleChange}
                /><br />

                <textarea name="message"
                placeholder="Message"
                value={form.message}
                onChange={handleChange}
                /><br />

                <button type="submit">Submit</button>
            </form>


            { status === "success" && (
                <p style={{ color: "green" }}>Lead submitted successfully.</p>
            )}

            { status === "missing" && (
                <p style={{ color: "red" }}>Please fill out all fields.</p>
            )}

            { status === "error" && (
                <p style={{ color: "red" }}>Submission failed. Try again.</p>
            )}

            { status === "invalidEmail" && (
                <p style={{ color: "red" }}>Please, enter a valid email.</p>
            )}
        </div>
    );
}
