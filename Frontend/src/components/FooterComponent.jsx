import React, { Component } from 'react';

class FooterComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {
            // State can be used for future enhancements
        };
    }

    render() {
        return (
            <div>
                <footer className="footer">
                    <span className="text-muted">2025</span>
                </footer>
            </div>
        );
    }
}

export default FooterComponent;
