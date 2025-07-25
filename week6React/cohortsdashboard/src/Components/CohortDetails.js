import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
    return (
        <div className={styles.box}>
            <h2>{cohort.name}</h2>
            <dl>
                <dt>Started On</dt>
                <dd>{cohort.startedOn}</dd>

                <dt>Current Status</dt>
                <dd>
                    <h3 className={cohort.status === 'Ongoing' ? styles.statusOngoing : styles.statusOther}>
                        {cohort.status}
                    </h3>
                </dd>

                <dt>Coach</dt>
                <dd>{cohort.coach}</dd>

                <dt>Trainer</dt>
                <dd>{cohort.trainer}</dd>
            </dl>
        </div>
    );
};

export default CohortDetails;